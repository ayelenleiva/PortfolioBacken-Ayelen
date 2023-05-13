
package com.portfolioo.ayelen.Service;

import com.portfolioo.ayelen.Entity.Red;
import com.portfolioo.ayelen.Repository.RRed;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional//persistencia en base de datos
public class SRed {
    @Autowired
    RRed rRed;
      
    
    public List<Red> list(){
        return rRed.findAll();
    }
    
    public Red getOne(int id){
        Red re= rRed.findById(id).orElse(null);
        return re;
    }
    
       
    public void save(Red re){
        rRed.save(re);
    }
    
     public void delete(int id){
        rRed.deleteById(id);
    }
     
    public void edit(Red re){
        rRed.save(re);
    }
    
    
     
    //busca lista de relojes por la id de la persona
    public List<Red> findByPersonaId(Long personaId) {
        return rRed.findByPersonaId(personaId);
    }
     
     
}
