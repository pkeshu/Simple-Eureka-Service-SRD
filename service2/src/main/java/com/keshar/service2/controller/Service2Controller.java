package com.keshar.service2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/service2")
public class Service2Controller {

    @Autowired
    public RestTemplate template;

    @GetMapping("/{age}")
    public String callService1(@PathVariable("age") int age) {
        String url = "http://SERVICE-1/service1/age/" + age;
        return template.getForObject(url, String.class);

    }
}
