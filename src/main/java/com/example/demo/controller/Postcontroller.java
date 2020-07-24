package com.example.demo.controller;

import com.example.demo.DemoApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class Postcontroller {

    @RequestMapping(value = "/student/postmethod",  method = RequestMethod.POST, consumes = "application/json")
    public String getdata(@RequestBody student s)
    {
        return "name : "+ s.getName() +"\n" + "roll : "+ s.getRoll() + "\n"+ " sec : " + s.getSec();

    }
}
