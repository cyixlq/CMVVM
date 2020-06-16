package top.cyixlq.cmvvm.utils

import com.google.gson.Gson
import java.lang.reflect.Type

class GsonUtil private constructor(){

    private object SingleHolder {
        val INSTANCE = Gson()
    }

    companion object {

        @JvmStatic
        fun getGson(): Gson {
            return SingleHolder.INSTANCE
        }

        @JvmStatic
        fun <T> fromJson(json: String, clazz: Class<T>): T {
            return getGson().fromJson(json, clazz)
        }

        @JvmStatic
        fun <T> fromJson(json: String, type: Type): T {
            return getGson().fromJson(json, type)
        }

        @JvmStatic
        fun toJson(src: Any): String {
            return getGson().toJson(src)
        }
    }
}