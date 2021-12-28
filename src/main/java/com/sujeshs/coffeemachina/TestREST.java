package com.sujeshs.coffeemachina;

import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestREST {

    public TestREST(Environment environment) {
        System.out.println("ctor now !! with port "+ environment.getProperty("server.port"));
    }

    @GetMapping("index")
    public String loadHomePage() {
        return "Roasting beans now";
    }

}
