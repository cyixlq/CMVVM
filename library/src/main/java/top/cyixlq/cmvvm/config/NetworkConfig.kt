package top.cyixlq.cmvvm.config

import okhttp3.Interceptor
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.CallAdapter
import retrofit2.Converter

data class NetworkConfig(
    var logLevel: HttpLoggingInterceptor.Level = HttpLoggingInterceptor.Level.BASIC,
    var readTimeOut: Long = 10000,
    var connectTimeOut: Long = 10000,
    var writeTimeOut: Long = 10000,
    var baseUrl: String = "",
    var converters: MutableList<Converter.Factory>? = null,
    var callAdapters: MutableList<CallAdapter.Factory>? = null,
    var interceptors: MutableList<Interceptor>? = null
)