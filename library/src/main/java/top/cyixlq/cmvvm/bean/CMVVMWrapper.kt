package top.cyixlq.cmvvm.bean

import top.cyixlq.cmvvm.config.LoggerConfig
import top.cyixlq.cmvvm.config.NetWorkConfig

class CMVVMWrapper {

    private var networkConfig: NetWorkConfig = NetWorkConfig()
    private var loggerConfig: LoggerConfig = LoggerConfig()

    fun networkConfig(init: NetWorkConfig.() -> Unit) {
        val config = NetWorkConfig()
        config.init()
        this.networkConfig = config
    }

    fun getNetworkConfig(): NetWorkConfig {
        return this.networkConfig
    }

    fun loggerConfig(init: LoggerConfig.() -> Unit) {
        val config = LoggerConfig()
        config.init()
        this.loggerConfig = config
    }

    fun getLoggerConfig(): LoggerConfig {
        return this.loggerConfig
    }
}

