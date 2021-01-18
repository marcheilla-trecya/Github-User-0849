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
    @Headers("Authorization: token 44ebfc6adeb910a72bd60e9bb0c00480231120cc")
    fun getSearchUsers(
        @Query("q") query: String
    ): Call<UserResponse>

    @GET("users/{username}")
    @Headers("Authorization: token 44ebfc6adeb910a72bd60e9bb0c00480231120cc")
    fun getUserDetail(
        @Path("username") username : String
    ): Call<DetailUserResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: token 44ebfc6adeb910a72bd60e9bb0c00480231120cc")
    fun getFollowers(
        @Path("username") username: String
    ): Call<ArrayList<User>>

    @GET("users/{username}/following")
    @Headers("Authorization: token 44ebfc6adeb910a72bd60e9bb0c00480231120cc")
    fun getFollowing(
        @Path("username") username: String
    ): Call<ArrayList<User>>
}