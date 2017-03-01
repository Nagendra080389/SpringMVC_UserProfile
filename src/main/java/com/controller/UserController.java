package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Nagendra on 01-03-2017.
 */
@Controller
public class UserController {

    @RequestMapping(value = "/getUser", method = RequestMethod.GET)
    public String getUserProfile(Model model){
        User user = new User("Nagendra", "7259146258");
        model.addAttribute("user", user);
        return "UserPage";
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getIndex(){
        return "index";
    }
}

