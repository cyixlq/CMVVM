package top.cyixlq.cmvvm.bean

import top.cyixlq.cmvvm.config.LoggerConfig
import top.cyixlq.cmvvm.config.NetworkConfig

class CMVVMWrapper {

    private var networkConfig: NetworkConfig = NetworkConfig()
    private var loggerConfig: LoggerConfig = LoggerConfig()

    fun networkConfig(init: NetworkConfig.() -> Unit) {
        val config = NetworkConfig()
        config.init()
        this.networkConfig = config
    }

    fun getNetworkConfig(): NetworkConfig {
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

