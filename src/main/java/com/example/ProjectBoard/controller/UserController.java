package com.example.ProjectBoard.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/userinfo")
    public String userInfo( Model model){
        model.addAttribute("username", "jesung");
        return "greetings";
    }

    @GetMapping("/bye")
    public String seeYouNext( Model model){
        model.addAttribute("nickname", "Brandon");
        return "goodbye";
    }
}
