package com.marcheilla.github_user_0849.api

import com.marcheilla.github_user_0849.data.model.DetailUserResponse
import com.marcheilla.github_user_0849.data.model.User
import com.marcheilla.github_user_0849.data.model.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {
    @GET("search/users")
    @Headers("Authorization: token 27cd1cb850207afb53859f64d2ed35964416a605")
    fun getSearchUsers(
        @Query("q") query: String
    ): Call<UserResponse>

    @GET("users/{username}")
    @Headers("Authorization: token 27cd1cb850207afb53859f64d2ed35964416a605")
    fun getUserDetail(
        @Path("username") username : String
    ): Call<DetailUserResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: token 27cd1cb850207afb53859f64d2ed35964416a605")
    fun getFollowers(
        @Path("username") username: String
    ): Call<ArrayList<User>>

    @GET("users/{username}/following")
    @Headers("Authorization: token 27cd1cb850207afb53859f64d2ed35964416a605")
    fun getFollowing(
        @Path("username") username: String
    ): Call<ArrayList<User>>
}