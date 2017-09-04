
package com.ifpb.spring.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OlaMundoController {
    
    @RequestMapping("/olaMundo")
    public String executar(){
        System.out.println("Requisição recebida com sucesso");
        return "ok";
    }
    
}
