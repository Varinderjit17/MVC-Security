package com.rupicodes.security.MVCsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecurityController {
    @GetMapping("/")
    public String showHome() {
        return "home";
    }
}
