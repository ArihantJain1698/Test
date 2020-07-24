package com.example.demo.controller;

import com.example.demo.DemoApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class hellocontroller {

    @GetMapping("/")
    public String f() {
        return "This is student";

    }


    @GetMapping("/student")
    public student details() {
        return new student("a", 5, 4);

    }

}










