package top.cyixlq.cmvvm.config

data class LoggerConfig(
    var enable: Boolean = true, // 是否开启Logger
    var errorMustShow: Boolean = true, // 错误信息是否必须打印出来，不管是否开启Logger
    var showThreadInfo: Boolean = true,
    var methodCount: Int = 2,
    var methodOffset: Int = 5,
    var globalTag: String = "CMVVM"
)