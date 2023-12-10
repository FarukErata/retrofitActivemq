package com.example.apitoqueue.util;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.net.http.HttpClient;

public class RetrofitUtil {

    private static Retrofit retrofit=null;

    public static Retrofit getRetrofitInstance(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://jsonplaceholder.typicode.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit;
    }
}
