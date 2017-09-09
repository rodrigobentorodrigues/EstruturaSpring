
package com.ifpb.padroes.infra;

import com.ifpb.padroes.interfaces.Dao;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DaoTeste implements Dao{
    
    private Connection con;
    
    @Autowired
    public DaoTeste(DataSource dataSource){
        try {
            this.con = dataSource.getConnection();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    @Override
    public boolean adicionar() {
        // Implementar
        return true;
    }

    @Override
    public boolean atualizar() {
        // Implementar
        return true;
    }

    @Override
    public boolean remover() {
        // Implementar
        return true;
    }

    @Override
    public List<Object> listarTodos() {
        List<Object> aux = new ArrayList<>();
        // Implementar
        return aux;
    }
    
}
