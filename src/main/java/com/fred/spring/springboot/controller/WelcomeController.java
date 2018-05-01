package com.fred.spring.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author liuxiaokun
 * @version 1.0.0
 * @date 2018-05-01
 */
@RestController
public class WelcomeController {

    @RequestMapping("/index")
    public String helloSpringBoot() {

        return "hello Spring Boot";
    }

    @RequestMapping("/date")
    public String helloSpringBoot(Date date) {

        return "hello Spring Boot" + date;
    }
}
