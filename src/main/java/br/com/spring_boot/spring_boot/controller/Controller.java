package br.com.spring_boot.spring_boot.controller;

import org.springframework.web.bind.annotation.RestController;

import br.com.spring_boot.spring_boot.models.Pessoa;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;



@RestController
public class Controller {
    
    @GetMapping("")
    public String Message() {
        return "Hellow World!";
    }

    @GetMapping("/name/{name}")    
    public String Nome(@PathVariable String name){
        return "Boas Vindas " + name;
    }

    @GetMapping("/name")
    public String Nome_Second(@RequestParam String name){
        return "Nome: " + name;
    }

    @PostMapping("/pessoa")
    public Pessoa pessoa(@RequestBody Pessoa p){
        return p;
    }
    
}
