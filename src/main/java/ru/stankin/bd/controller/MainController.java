package ru.stankin.bd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String main() {
        return "/main/index";
    }

    @GetMapping("/database")
    public String database() {
        return "/database/index";
    }
}