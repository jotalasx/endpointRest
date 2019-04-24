package com.chema.demoChemaRest.web.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController//La llamada que vamos a hacer
public class HolaMundoResource {

    @RequestMapping (path = "/Saludar", method = RequestMethod.GET) //Para llamar a este método a través del Get
    public String saludar(){
        return "Hola Mundo, este es mi primer endpoint con SpringBoot";
    }

}
