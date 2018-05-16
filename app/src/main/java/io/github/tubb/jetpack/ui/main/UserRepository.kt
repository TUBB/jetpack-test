package io.github.tubb.jetpack.ui.main

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.fastjson.FastJsonConverterFactory

class UserRepository private constructor() {

    companion object {
        private var webservice: Webservice;
        private var retrofit: Retrofit = Retrofit.Builder()
                // replace it for your api server
                .baseUrl("http://10.5.16.64:8080/")
                .addConverterFactory(FastJsonConverterFactory.create())
                .build()
        private var instance: UserRepository = UserRepository()
        init {
            webservice = retrofit.create(Webservice::class.java)
        }
        fun getInstance(): UserRepository {
            return instance
        }
    }

    fun getUser(userId: String): LiveData<StatusData<User>> {
        val data: MutableLiveData<StatusData<User>> = MutableLiveData()
        webservice.getUser(userId).enqueue(object : Callback<StatusData<User>> {
            override fun onFailure(call: Call<StatusData<User>>?, ex: Throwable?) {
                data.value = StatusData.obtainNetErrorStatusData(ex)
            }

            override fun onResponse(call: Call<StatusData<User>>?, response: Response<StatusData<User>>?) {
                data.value = response?.body()
            }
        })
        return data;
    }
}
