package com.example.sweater;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class GreetingController {

    @GetMapping("/greeting")
    //name - название параметра
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World")
                                       String name, Map<String,Object> model) {
        model.put("name", name);
        return "greeting"; //имя файла для спрингового контейнера, который мы хотим отобразить
    }

    //начальная страница
    @GetMapping
    public String main(Map <String,Object> model){
        model.put("some","hello, let's Code!");
        model.put("second","вроде поняла, как это работает");
        return "main"; //возвращает шаблон
    }

    @GetMapping("/another")
    public String my(@RequestParam(name="sex", required=false, defaultValue="male")
                                   String sex, Map<String,Object> model) {
        model.put("sex", sex);
        return "sex";
    }

}