package top.cyixlq.cmvvm.network

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import top.cyixlq.cmvvm.config.NetWorkConfig
import top.cyixlq.cmvvm.network.interceptor.InterceptorLogger
import top.cyixlq.cmvvm.utils.GsonUtil
import java.util.concurrent.TimeUnit

class RetrofitManager private constructor() {

    private object SingleHolder {
        val INSTANCE = RetrofitManager()
    }

    companion object {
        @JvmStatic
        fun getInstance(): RetrofitManager {
            return SingleHolder.INSTANCE
        }
    }

    private lateinit var retrofit: Retrofit
    private lateinit var okHttpClient: OkHttpClient

    fun init(config: NetWorkConfig) {
        okHttpClient = OkHttpClient.Builder()
            .readTimeout(config.readTimeOut, TimeUnit.MICROSECONDS)
            .connectTimeout(config.connectTimeOut, TimeUnit.MICROSECONDS)
            .writeTimeout(config.writeTimeOut, TimeUnit.MICROSECONDS)
            .apply {
                val interceptors = config.interceptors
                if (interceptors != null) {
                    interceptors.forEach { addInterceptor(it) }
                } else {
                    addInterceptor(HttpLoggingInterceptor(InterceptorLogger()).apply {
                        setLevel(config.logLevel)
                    })
                }
            }
            .build()
        retrofit = Retrofit.Builder()
            .client(okHttpClient)
            .baseUrl(config.baseUrl)
            .apply {
                val callAdapters = config.callAdapters
                if (callAdapters != null) {
                    callAdapters.forEach { addCallAdapterFactory(it) }
                } else {
                    addCallAdapterFactory(RxJava3CallAdapterFactory.create())
                }
                val converters = config.converters
                if (converters != null) {
                    converters.forEach { addConverterFactory(it) }
                } else {
                    addConverterFactory(GsonConverterFactory.create(GsonUtil.getGson()))
                }
            }
            .build()
    }

    fun <T> create(clazz: Class<T>): T {
        return retrofit.create(clazz)
    }
}