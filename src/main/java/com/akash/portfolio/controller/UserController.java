package com.akash.portfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    @GetMapping("/register")
    public String showRegistrationForm() {
        return "register";
    }

    @PostMapping("/submitForm")
    public String submitForm(
            @RequestParam("name") String name,
            @RequestParam("email") String email,
            Model model) {
        model.addAttribute("name", name);
        model.addAttribute("email", email);
        return "userDetails";
    }
}
