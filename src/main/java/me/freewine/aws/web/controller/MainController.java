package me.freewine.aws.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import me.freewine.aws.web.entity.User;
import me.freewine.aws.web.service.UserService;

@Controller
public class MainController {
    @Autowired
    private UserService userService;

    @GetMapping("/")
	public String web(Model model) {

        List<User> users = userService.getAll();
        model.addAttribute("users", users);
        
		return "index";
	}

    @PostMapping("/")
	public String addUser(@ModelAttribute User user, Model model) {

        userService.insert(user);

        List<User> users = userService.getAll();
        model.addAttribute("users", users);
		return "index";
	}
}
