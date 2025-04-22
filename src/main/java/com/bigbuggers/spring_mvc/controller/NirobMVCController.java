package com.bigbuggers.spring_mvc.controller;

import com.bigbuggers.spring_mvc.service.DesignMVCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DesignMVCController {
    @Autowired
    private DesignMVCService designMVCService;

    @GetMapping("/mvc")
    //@ResponseBody
    public String greeting(Model model) {
        String massage = designMVCService.getMVCGreeting();
        model.addAttribute("textField", massage);
        return "greetingNirob";
    }
}
