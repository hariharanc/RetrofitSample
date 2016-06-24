package com.sample.model;

import com.sample.pojo.GeoNames;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by hariharan on 22-06-2016.
 */
public interface GeoNameApi {
    @FormUrlEncoded
    @POST("citiesJSON?/")
    Call<GeoNames> createUser(@Field("north") String north, @Field("south") String south, @Field("east") String east,
                              @Field("west") String west,   @Field("lang") String lang, @Field("username") String username);
}
