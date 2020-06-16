package top.cyixlq.example

import android.app.Application
import top.cyixlq.cmvvm.CMVVM

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        CMVVM.init(this) {
            networkConfig {
                baseUrl = "https://api.apiopen.top/"
            }
            loggerConfig {
                enable = BuildConfig.DEBUG
            }
        }
    }
}