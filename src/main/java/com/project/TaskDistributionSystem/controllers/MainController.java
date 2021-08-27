package com.project.TaskDistributionSystem.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    // Обработчик главной страницы.
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Главная страница");
        return "home";
    }

    // Обработчик ???.
    @GetMapping("/board")
    public String board(Model model) {
        model.addAttribute("title", "Доска");
        return "board";
    }




}