package top.cyixlq.cmvvm.utils

import android.content.Context
import android.widget.Toast

object ToastUtil {
    fun toastShort(context: Context, msg: String) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
    }

    fun toastLong(context: Context, msg: String) {
        Toast.makeText(context, msg, Toast.LENGTH_LONG).show()
    }
}