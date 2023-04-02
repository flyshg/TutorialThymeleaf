package com.techacademy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {

    @GetMapping("/input")
    public String getForm() {
        return "input";
    }

    @PostMapping("/confirm")
    public String postForm(@RequestParam("val") String val, Model model) {
        model.addAttribute("val", val);

        return "confirm";
    }
}
