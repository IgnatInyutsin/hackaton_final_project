package com.example.backend.repositories;

import com.example.backend.models.Greeting;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

//интерфейс взаимодействия с таблицей greeting
@Repository
public interface GreetingRepository extends CrudRepository<Greeting, Long> {
    //метод для поиска элементов по id создается автоматически
    ArrayList<Greeting> findAllById(Long id);
}