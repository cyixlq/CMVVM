package top.cyixlq.example.view

import autodispose2.autoDispose
import top.cyixlq.cmvvm.network.RetrofitManager
import top.cyixlq.example.base.BaseViewModel
import top.cyixlq.example.model.apiservice.ApiService

class MainViewModel : BaseViewModel() {

    fun getJokes() {
        val api = RetrofitManager.getInstance().create(ApiService::class.java)
        api.getJoke(1,2, "video")
            .map {
                it.result
            }
            .autoDispose(this)
            .subscribe {

            }
    }
}