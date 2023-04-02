package com.techacademy;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NowController {

    @GetMapping("/now")
    public String getNow(Model model) {
        model.addAttribute("msg", "now:" + LocalDateTime.now());
        return "now";
    }
}
