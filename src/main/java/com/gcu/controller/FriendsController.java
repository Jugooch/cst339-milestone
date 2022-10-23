package com.gcu.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gcu.model.FriendModel;

@Controller
@RequestMapping("/friends")
public class FriendsController {

    @GetMapping("/")
    public String display(Model model) 
    {
        List<FriendModel> friends = new ArrayList<FriendModel>();
        
        model.addAttribute("title", "Friends");
        model.addAttribute("friends", friends);
        return "friends";
    }
}
