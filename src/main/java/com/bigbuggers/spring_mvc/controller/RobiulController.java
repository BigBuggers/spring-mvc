package com.bigbuggers.spring_mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.bigbuggers.spring_mvc.service.RobiulService;

@Controller
public class RobiulController {
	@Autowired
	private RobiulService robiulService;
    @GetMapping("/greeting/robiul")
    String getGreeting(Model model)
    {
        String message = robiulService.greetMessage();
        model.addAttribute("message", message);
        return "greeting";
    }


}
