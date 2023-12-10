package com.example.apitoqueue;

import okhttp3.OkHttpClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@SpringBootApplication
public class ApiToQueueApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiToQueueApplication.class, args);
    }
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
//    OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
//    Retrofit retrofit = new Retrofit.Builder()
//            .baseUrl("https://stephen-king-api.onrender.com/api/books")
//            .addConverterFactory(GsonConverterFactory.create())
//            .client(httpClient.build())
//            .build();


}
