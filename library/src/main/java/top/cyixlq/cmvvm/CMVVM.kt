package top.cyixlq.cmvvm

import android.app.Application
import android.content.Context
import com.orhanobut.logger.AndroidLogAdapter
import com.orhanobut.logger.FormatStrategy
import com.orhanobut.logger.Logger
import com.orhanobut.logger.PrettyFormatStrategy
import top.cyixlq.cmvvm.bean.CMVVMWrapper
import top.cyixlq.cmvvm.config.LoggerConfig
import top.cyixlq.cmvvm.network.RetrofitManager


object CMVVM {

    private lateinit var application: Application

    fun init(application: Application, init: CMVVMWrapper.() -> Unit) {
        this.application = application
        val wrapper = CMVVMWrapper()
        wrapper.init()
        RetrofitManager.getInstance().init(wrapper.getNetworkConfig())
        initLogger(wrapper.getLoggerConfig())
    }

    private fun initLogger(config: LoggerConfig) {
        val formatStrategy: FormatStrategy = PrettyFormatStrategy.newBuilder()
            .showThreadInfo(config.showThreadInfo) // (Optional) Whether to show thread info or not. Default true
            .methodCount(config.methodCount) // (Optional) How many method line to show. Default 2
            .methodOffset(config.methodOffset) // (Optional) Hides internal method calls up to offset. Default 5
            //.logStrategy(customLog) // (Optional) Changes the log strategy to print out. Default LogCat
            .tag(config.globalTag) // (Optional) Global tag for every log. Default PRETTY_LOGGER
            .build()
        Logger.addLogAdapter(object: AndroidLogAdapter(formatStrategy) {
            override fun isLoggable(priority: Int, tag: String?): Boolean {
                if (priority == Logger.ERROR && config.errorMustShow) return true
                return config.enable
            }
        })
    }

    fun getApplicationContext(): Context {
        return this.application.applicationContext
    }

    fun getApplication(): Application {
        return this.application
    }
}