package com.techacademy;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InlineController {
    @GetMapping("/each")
    public String getEach(Model model) {
        List<Member> members = new ArrayList<>();

        members.add(new Member(1, "taro", "男性", 27));
        members.add(new Member(2, "jiro", "男性", 28));
        members.add(new Member(3, "hanako", "woman", 29));
            model.addAttribute("obj", members);
        return "each";
    }
}
