package com.uabc.edu.app.practica1.controller;

import com.uabc.edu.app.practica1.model.Operacion;
import org.springframework.web.bind.annotation.*;

@RestController

public class CalculadoraAvzController {

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
}
