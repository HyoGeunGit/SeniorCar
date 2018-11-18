package com.traffic.shimhg02.seniorcar




import retrofit2.Call
import retrofit2.http.*
import okhttp3.ResponseBody
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST
import retrofit2.http.GET



/**
 * Created by Kinetic on 2018-06-02.
 */

interface API {
    @GET("/place")
    fun getPlace() :  Call<ArrayList<LocationRepo>>

    @POST("/user/signin")
    @FormUrlEncoded
    fun logIn(@Field("id") id : String, @Field("pw") pw : String) :  Call<Void>

    @POST("/user/signup")
    @FormUrlEncoded
    fun logUp(@Field("name") name : String, @Field("id") id : String, @Field("pw") pw : String) :  Call<Void>
}