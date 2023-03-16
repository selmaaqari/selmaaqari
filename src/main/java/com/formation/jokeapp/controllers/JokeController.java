package com.formation.jokeapp.controllers;

import com.formation.jokeapp.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.PublicKey;

@Controller
public class JokeController {
    private final JokeService js;

    public JokeController(JokeService js) {
        this.js = js;
    }

    @RequestMapping( "/")
    public String showJoke (Model model){
        model.addAttribute("joke",js.getJoke());
        return "index";
    }

}
