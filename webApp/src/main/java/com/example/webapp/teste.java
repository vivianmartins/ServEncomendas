package com.example.webapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class teste {

        @RequestMapping
            public String helloWorld(){
            return "teste";
        }

}
