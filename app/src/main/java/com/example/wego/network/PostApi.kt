package com.example.wego.network

import android.database.Observable
import com.example.wego.model.Post
import retrofit2.http.GET

interface PostApi {

    @GET("/posts")
    fun getPosts() : Observable<List<Post>>
}