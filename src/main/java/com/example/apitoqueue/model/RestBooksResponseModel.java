package com.example.apitoqueue.model;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class RestBooksResponseModel implements Serializable {
    private int id ;
    private int Year;
    private String Title;
    private String handle;
    private String Publisher;
    private String ISBN;
    private int Pages;
    public String Notes;
    public String created_at;
    public List<String> villains;


    @Override
    public String toString() {
        return "RestBooksResponseModel{" +
                "id=" + id +
                ", Year=" + Year +
                ", Title='" + Title + '\'' +
                ", handle='" + handle + '\'' +
                ", Publisher='" + Publisher + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", Pages=" + Pages +
                ", Notes='" + Notes + '\'' +
                ", created_at='" + created_at + '\'' +
                ", villains=" + villains +
                '}';
    }
}
