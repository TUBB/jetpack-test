package io.github.tubb.jetpack.ui.main

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface Webservice {
    @GET("users/{user}")
    fun getUser(@Path("user") userId: String): Call<StatusData<User>>
}