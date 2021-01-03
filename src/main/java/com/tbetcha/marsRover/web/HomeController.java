package com.tbetcha.marsRover.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String getHomeView(ModelMap model){
        model.put("name", "Troy Boettger");
        model.put("address", "123234 mian st.");
        return "index";


    }
}
