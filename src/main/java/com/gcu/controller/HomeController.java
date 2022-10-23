package com.gcu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/home")
public class HomeController {

    @GetMapping("/")
    public String display(Model model) 
    {
        model.addAttribute("title", "Home");
        model.addAttribute("pageName", "Home");
        
        return "home";
    }
    
    @GetMapping("/tech")
    public String displayTech(@RequestParam("pageName") String pageName, Model model) 
    {
        model.addAttribute("title", "Home");
        model.addAttribute("pageName", "Technology");
        
        return "home";
    }
    
    @GetMapping("/art")
    public String displayArt(@RequestParam("pageName") String pageName, Model model) 
    {
        model.addAttribute("title", "Home");
        model.addAttribute("pageName", "Art");
        
        return "home";
    }
    
    @GetMapping("/sports")
    public String displaySports(@RequestParam("pageName") String pageName, Model model) 
    {
        model.addAttribute("title", "Home");
        model.addAttribute("pageName", "Sports");
        
        return "home";
    }
}
