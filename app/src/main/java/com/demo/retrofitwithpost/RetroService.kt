package com.demo.retrofitwithpost

import retrofit2.Call
import retrofit2.http.*

interface RetroService {

    //https://gorest.co.in/public-api/users
    @GET("users")
    @Headers("Accept:application/json","Content-Type:application/json")
    fun getUsersList(): Call<UserList>

//    fun getUsersList(@Header("Content-Type") pType : String): Call<UserList>

    //https://gorest.co.in/public-api/users?name=a
    @GET("users")
    @Headers("Accept:application/json","Content-Type:application/json")
    fun searchUsers(@Query("name") searchText: String): Call<UserList>

//    fun searchUsers(@QueryMap pQueryMap: Map<String,String>): Call<UserList>

    //https://gorest.co.in/public-api/users/121
    @GET("users/{user_id}")
    @Headers("Accept:application/json","Content-Type:application/json")
    fun getUser(@Path("user_id") user_id: String): Call<UserResponse>


    @POST("users")
    fun createUser(@HeaderMap pHeaderMap: Map<String,String>,@Body params: User): Call<UserResponse>

    @PUT("users/{user_id}")
    @Headers("Accept:application/json", "Content-Type:application/json",
        "Authorization: Bearer ${Constants.ACCESS_TOKEN}")
    fun updateUser(@Path("user_id") user_id: String, @Body params: User): Call<UserResponse>

    @DELETE("users/{user_id}")
    @Headers("Accept:application/json", "Content-Type:application/json",
        "Authorization: Bearer ${Constants.ACCESS_TOKEN}")
    fun deleteUser(@Path("user_id") user_id: String): Call<UserResponse>

}