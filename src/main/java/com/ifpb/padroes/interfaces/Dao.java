
package com.ifpb.padroes.interfaces;

import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public interface Dao {
    
    boolean adicionar();
    boolean atualizar();
    boolean remover();
    List<Object> listarTodos();
    
}
