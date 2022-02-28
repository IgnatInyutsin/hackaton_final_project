package com.example.backend.controllers;

import com.example.backend.models.Greeting;
import com.example.backend.repositories.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class IndexController {
    //подключаем репозиторий
    @Autowired
    private GreetingRepository greetingRepository;

    public AtomicLong id = new AtomicLong(1);

    //ответ на запрос в корень
    @GetMapping("/")
    public Object main() {
        //если в бд нет записи - создаем
        if (greetingRepository.findAllById(id.get()).isEmpty()) {
            greetingRepository.save(new Greeting(id.get(), "Hello, World!"));
        }

        //выводим записем с id = 1
        ArrayList result = greetingRepository.findAllById(id.get());
        return result.get(0);
    }
}