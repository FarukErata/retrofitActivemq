package com.example.apitoqueue.service;

import com.example.apitoqueue.model.RestBooksResponseModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BooksService {

    public List<RestBooksResponseModel> fetchRestBooksResponse();
}
