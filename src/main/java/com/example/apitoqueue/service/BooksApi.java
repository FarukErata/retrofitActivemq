package com.example.apitoqueue.service;

import com.example.apitoqueue.model.RestBooksResponseModel;
import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;

public interface BooksApi {

    @GET("/books")
    Call<List<RestBooksResponseModel>> fetchRestBooksResponseModel();
}
