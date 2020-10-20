package com.tangjianbo.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class Controller {
    @GetMapping("/getName")
    public String getName(@RequestParam("name") String name){
        return name;
    }
    @GetMapping("/get")
    public String getName(){
        return "";
    }
}
