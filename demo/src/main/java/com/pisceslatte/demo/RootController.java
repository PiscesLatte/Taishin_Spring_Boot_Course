package com.pisceslatte.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RootController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("message","Hi, I'm PiscesLatte");
        return "home";
    }
}
