package top.cyixlq.cmvvm.ext

import top.cyixlq.cmvvm.CMVVM
import top.cyixlq.cmvvm.utils.ToastUtil

fun String.toastShort() {
    ToastUtil.toastShort(
        CMVVM.getApplicationContext(),
        this
    )
}

fun String.toastLong() {
    ToastUtil.toastLong(
        CMVVM.getApplicationContext(),
        this
    )
}