
package com.ifpb.padroes.controladores;

import com.ifpb.padroes.infra.DaoTeste;
import com.ifpb.padroes.interfaces.Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Teste {
    
    private Dao dao;
    
    @Autowired
    public Teste(DaoTeste dao){
        this.dao = dao;
    }
    
    @RequestMapping("teste")
    public String ir(){
        return "ok";
    }
    
}
