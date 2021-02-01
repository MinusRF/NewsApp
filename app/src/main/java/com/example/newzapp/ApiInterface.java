package com.example.newzapp;

import com.example.newzapp.Model.Headings;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {


    @GET("top-headlines")
    Call<Headings> getHeadlines(
            @Query("country") String country,
            @Query("apiKey") String apiKey
    );

    @GET("everything")
    Call<Headings> getSpecificData(
            @Query("q") String query,
            @Query("apiKey") String apiKey
    );



}
