package top.cyixlq.example.model.apiservice

import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET
import retrofit2.http.Query
import top.cyixlq.example.base.BaseResult
import top.cyixlq.example.model.bean.JokeVideo

interface ApiService {
    @GET("getJoke")
    fun getJoke(@Query("page") page: Int, @Query("count") count: Int,
                @Query("type") type: String): Single<BaseResult<ArrayList<JokeVideo>>>
}