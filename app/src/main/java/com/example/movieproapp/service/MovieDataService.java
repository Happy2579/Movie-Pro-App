package com.example.movieproapp.service;

import com.example.movieproapp.model.Result;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MovieDataService {

    //Base URL
    //https://api.themoviedb.org/3/
    //
    //End Point URL
    // movie/popular?api_key=a14b903eaef9840b0ad661b32bf52038
    @GET("movie/popular")
    Call<Result> getPopularMovies(@Query("api_key") String apiKey);
}
