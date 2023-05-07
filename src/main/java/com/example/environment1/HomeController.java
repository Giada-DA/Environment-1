package com.example.environment1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Autowired
    Environment environment;

    @GetMapping("/saluto")
    public String sayHello(){
        return "Benvenuto!";
    }

    @GetMapping("/dettagli")
    public String cose(){
        String nome = environment.getProperty("devName");
        String codice = environment.getProperty("authCode");
        return nome + ": " + codice;
    }
}
