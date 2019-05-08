package com.yan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IController {

    @RequestMapping("/")
    public String index(Model model){

        model.addAttribute("name","赵四");
        return "index";
    }
}
