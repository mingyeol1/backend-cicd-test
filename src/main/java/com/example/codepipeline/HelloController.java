package com.example.codepipeline;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/sayHello/{name}")
    public String sayHello(@PathVariable String name) {
        return "Hello " + name;
    }

    @GetMapping("/")
    public String root() {
        return "Hi This Page Before Modifiyed VPC을 함부로 지우지맙시다!!!!!!!!!!!!!!!!!!!!!!!!!";
    }


}
