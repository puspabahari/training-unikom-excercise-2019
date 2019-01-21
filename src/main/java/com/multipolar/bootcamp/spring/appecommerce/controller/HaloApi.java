package com.multipolar.bootcamp.spring.appecommerce.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HaloApi {

    @GetMapping("/halo")
    public String halo() {
        return "{\n" +
                "  \"message\": \"Halo ini dari springboot 2!\"\n" +
                "}";
    }
}