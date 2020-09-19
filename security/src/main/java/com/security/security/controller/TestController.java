package com.security.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
    @RequestMapping("/list")
    public void list() {

    }

    @RequestMapping("/add")
    public void add() {

    }

    @RequestMapping("/del")
    public void del() {

    }

    @RequestMapping("/update")
    public void update() {

    }

    @RequestMapping("/get")
    public void get() {

    }
}
