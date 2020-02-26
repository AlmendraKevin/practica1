package com.uabc.edu.app.practica1.controller;

import com.uabc.edu.app.practica1.model.Operacion;
import org.springframework.web.bind.annotation.*;

@RestController
public class CalculadoraController {
    @PostMapping("ops")
    public Operacion operaciones(@RequestBody
                                         Operacion operacion){
        switch (operacion.getOp()){
            case SUMA:
                operacion.setResultado(operacion.getNumeroA()+
                        operacion.getNumeroB());
                break;
            case RESTA:
                operacion.setResultado(operacion.getNumeroA()-
                        operacion.getNumeroB());
                break;
            case DIVISION:
                if(operacion.getNumeroA()!=0&&operacion.getNumeroB()!=0){
                    operacion.setResultado(operacion.getNumeroA()/operacion.getNumeroB());
                }
                break;
            case MULTIPLICACION:
                operacion.setResultado(operacion.getNumeroA()*
                        operacion.getNumeroB());
                break;

        }
        return operacion;
    }
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
