package com.example.apitoqueue.controller;

import com.example.apitoqueue.model.RestBooksResponseModel;
import com.example.apitoqueue.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/retrofit")
public class BooksController {

    @Autowired
    BooksService booksService;



    @GetMapping("/books")
    public List<RestBooksResponseModel> fetchDataAndSendToQueue() {
        return booksService.fetchRestBooksResponse();
    }
}
