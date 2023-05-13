
package com.portfolioo.ayelen.Service;

import com.portfolioo.ayelen.Entity.Proyecto;
import com.portfolioo.ayelen.Repository.RProyecto;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional//persistencia en base de datos
public class SProyecto {
    
    @Autowired
    RProyecto rProyecto;
    
    public List<Proyecto> list(){
        return rProyecto.findAll();
    }
    
    public Proyecto getOne(int id){
        Proyecto proye = rProyecto.findById(id).orElse(null);
        return proye;
    }      
    
    public void save(Proyecto proye){
        rProyecto.save(proye);
    }
    
     public void delete(int id){
        rProyecto.deleteById(id);
    }
     
     public void edit(Proyecto proye){
        rProyecto.save(proye);
    }
           
     
     //busca lista de relojes por la id de la persona
    public List<Proyecto> findByPersonaId(Long personaId) {
        return rProyecto.findByPersonaId(personaId);
    }
    
    
}
