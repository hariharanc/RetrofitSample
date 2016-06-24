package com.sample.model;

import com.sample.pojo.Country;
import com.sample.pojo.CountryFromCode;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by hariharan on 23-06-2016.
 */
public interface CountryFromCodeApi {

    @GET("/rest/v1/alpha?")
    Call<List<CountryFromCode>> getTasks(@Query("codes") String order);
}
