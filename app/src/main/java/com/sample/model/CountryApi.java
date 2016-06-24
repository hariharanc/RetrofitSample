package com.sample.model;

import com.sample.pojo.Country;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by hariharan on 22-06-2016.
 */
public interface CountryApi {

    @GET("rest/v1/all")
    Call<List<Country>> getCountry();


}
