package com.pisceslatte.demo.controllers;

import com.pisceslatte.demo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RootController {
    @Autowired
    private GreetingService service;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("message","Hi, I'm PiscesLatte");
        return "home";
    }

    @RequestMapping("/greeting")
    public @ResponseBody String greeting() {
        return service.greet();
    }
}
