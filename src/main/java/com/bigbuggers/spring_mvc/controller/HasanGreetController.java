package com.bigbuggers.spring_mvc.controller;

import com.bigbuggers.spring_mvc.service.HasanGreetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.Model;
@Controller

public class HasanGreetController {

    @Autowired
   private HasanGreetService hasanGreetService;

    @GetMapping("/greeting/hasan")
    String getGreeting(Model model)
    {
        String message = hasanGreetService.greetMessage();
        model.addAttribute("message", message);
        return "greeting";
    }

}
