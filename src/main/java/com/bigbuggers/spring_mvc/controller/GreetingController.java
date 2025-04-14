package com.bigbuggers.spring_mvc.controller;


import com.bigbuggers.spring_mvc.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetingController {

    @Autowired
    private GreetingService greetingService;

    @GetMapping("/greeting")
    public String getGreeting(Model model) {
        String message = greetingService.getGreetingMessage();
        model.addAttribute("message", message);
        return "greeting"; // maps to greeting.html
    }
}
