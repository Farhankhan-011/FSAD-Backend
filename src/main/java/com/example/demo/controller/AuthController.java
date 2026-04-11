package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@CrossOrigin(origins = "http://localhost:3000")
public class AuthController {

    @GetMapping("/login")
    public String login(@RequestParam String email,
                        @RequestParam String password) {

        if (email.equals("2400030908") && password.equals("Wealth")) {
            return "SUCCESS";
        } else {
            return "FAIL";
        }
    }
}