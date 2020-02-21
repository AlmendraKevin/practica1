package com.uabc.edu.app.practica1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculadoraController {

    @GetMapping("/")
    public String inicio(){
        return "<b>Aqui no hay nada intenta con otra cosa</b>";
    }

    @GetMapping("/suma")
    public float sumar(@RequestParam(value = "numA") float a,
                       @RequestParam(value = "numB") float b){
        return  a+b;
    }

    @GetMapping("/resta")
    public float restar(@RequestParam(value = "numA") float a,
                        @RequestParam(value = "numB") float b){
        return  a-b;
    }

    @GetMapping("/multiplicacion")
    public float rmultiplicar(@RequestParam(value = "numA") float a,
                        @RequestParam(value = "numB") float b){
        return  a*b;
    }
    @GetMapping("/division")
    public float dividir(@RequestParam(value = "numA") float a,
                        @RequestParam(value = "numB") float b){
        return  a/b;
    }
    @GetMapping("/cuadrado")
    public float potencia(@RequestParam(value = "numA") float a){
        return  a*a;
    }

    @GetMapping("/porcentaje")
    public float porcentaje(@RequestParam(value = "numA") float a,
                            @RequestParam(value = "numB") float b){
        return  (a*b)/100;
    }



}
