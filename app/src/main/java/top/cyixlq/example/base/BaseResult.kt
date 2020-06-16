package top.cyixlq.example.base

data class BaseResult<T>(
    val code: Int,
    val message: String,
    val result: T
)