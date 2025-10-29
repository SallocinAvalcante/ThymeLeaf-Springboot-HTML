package com.nicollas.thymeleafapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PaginasController {

    @GetMapping("/pagina1")
    public String pagina1(Model model) {
        model.addAttribute("mensagem", "Olá do backend!");
        return "pagina1";
    }

    @GetMapping("/pagina2")
    public String pagina2(Model model) {
        model.addAttribute("nome", "Nicollas");
        return "pagina2";
    }
}
