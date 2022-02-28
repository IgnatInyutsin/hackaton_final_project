package com.example.backend.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//модель таблицы greeting
@Entity
public class Greeting {
    //поле id с autoincrement
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String text;

    //конструктор для нормального класса
    public Greeting(long id, String text) {
        this.id = id;
        this.text = text;
    }

    //конструктор для фреймворка
    public Greeting() {

    }

    //getters и setters
    public long getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
