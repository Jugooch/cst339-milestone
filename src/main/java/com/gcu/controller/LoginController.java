package com.gcu.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gcu.model.LoginModel;
import com.gcu.model.RegistrationModel;
import com.gcu.model.UserModel;

@Controller
@RequestMapping("/")
public class LoginController 
{


    /**
     * Display 
     * 
     * @param model
     * @return
     */
    @GetMapping("/")
    public String display(Model model) 
    {
        model.addAttribute("title", "Login Form");
        model.addAttribute("loginModel", new LoginModel());
        return "login";
    }
    
    /**
     * performs a login
     * 
     * @return
     */
    @PostMapping("/doLogin")
    public String doLogin(@Valid LoginModel loginModel, BindingResult bindingResult, Model model) {

        /*
        if(bindingResult.hasErrors()) {
            model.addAttribute("title", "Log in Form");      
            return "login";
        }
        */
        
        
        model.addAttribute("title", "Home");
        model.addAttribute("user", new UserModel());
        
        return "home";
    }
    
    /**
     * takes the user to the registration form
     * 
     * @return
     */
    @PostMapping("/newUser")
    public String newUser(@Valid LoginModel loginModel, BindingResult bindingResult, Model model) {      
        
        model.addAttribute("title", "Registration");
        model.addAttribute("registrationModel", new RegistrationModel());
        
        return "registration";
    }
}
