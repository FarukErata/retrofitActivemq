package com.example.apitoqueue.service.impl;

import com.example.apitoqueue.model.RestBooksResponseModel;
import com.example.apitoqueue.service.BooksApi;
import com.example.apitoqueue.service.BooksService;
import com.example.apitoqueue.util.RetrofitUtil;
import org.springframework.stereotype.Component;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Component
public class BooksServiceImpl implements BooksService {


    private Retrofit retrofit;
    private BooksApi booksApi;
    //private JmsTemplate jmsTemplate;

    public BooksServiceImpl() {
        retrofit= RetrofitUtil.getRetrofitInstance();
        booksApi= retrofit.create(BooksApi.class);

    }

    @Override
    public List<RestBooksResponseModel> fetchRestBooksResponse() {
         List<RestBooksResponseModel> booksResponse= new ArrayList<>();

        Call<List<RestBooksResponseModel>> fetchBooksCall= booksApi.fetchRestBooksResponseModel();

        try {
            Response<List<RestBooksResponseModel>> response = fetchBooksCall.execute();

            if(response.isSuccessful() && response.body()!=null){
                booksResponse= response.body();

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return booksResponse;//jmsTemplate.convertAndSend("getString-queue", booksResponse);
    }
}
