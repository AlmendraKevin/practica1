package com.uabc.edu.app.practica1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CalculadoraAvzController {


    @GetMapping("/index")
    public String inicio(){

        return "index";
    }

    @GetMapping("/paginaA")
    public String pagina(){

        return "lepractica";
    }
    @GetMapping("/paginaB")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "lepractica";
    }

}
