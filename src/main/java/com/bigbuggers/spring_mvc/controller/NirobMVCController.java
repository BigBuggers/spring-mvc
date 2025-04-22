package com.bigbuggers.spring_mvc.controller;

import com.bigbuggers.spring_mvc.service.NirobMVCService;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NirobMVCController {
    private NirobMVCService nirobMVCService;

    public NirobMVCController(NirobMVCService nirobMVCService) {
        this.nirobMVCService = nirobMVCService;
    }

    @GetMapping("/mvc")
    //@ResponseBody
    public String greeting(Model model) {
        String massage = nirobMVCService.getMVCGreeting();
        model.addAttribute("textField", massage);
        return "greetingNirob";
    }
}
