package com.sujeshs.coffeemachina;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestREST {

    public TestREST() {
        System.out.println("ctor now !!");
    }

    @GetMapping("index")
    public String loadHomePage() {
        return "Roasting beans now";
    }

}
