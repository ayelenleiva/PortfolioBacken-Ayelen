
package com.portfolioo.ayelen.Controller;

import com.portfolioo.ayelen.Entity.Red;
import com.portfolioo.ayelen.Service.SRed;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/red")
@CrossOrigin(origins = {"https://portfoliofrontend1.web.app","http://localhost:4200"})
public class CRed {
    
    @Autowired
    SRed sRed;
    
    
    @GetMapping ("/lista")
    public ResponseEntity<List<Red>> list(){
        List<Red> list = sRed.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    
      //lista por id de persona
    @GetMapping ("/persona/{id}/lista")
    public List <Red> findByPersonaId(@PathVariable Long id){
        return sRed.findByPersonaId(id);    
        }
    
    @GetMapping("/detail/{id}")
    public ResponseEntity<Red> getById(@PathVariable("id") int id){
        Red red = sRed.getOne(id);
        return new ResponseEntity(red, HttpStatus.OK);
    }
    
    @PostMapping("/create")
    public void create(@RequestBody Red red) {      
        sRed.save(red);
    }
    
      @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable ("id") int id){
        sRed.delete(id);
    }
    
    @PutMapping("/update")
    public void edit(@RequestBody Red red) {      
        sRed.save(red);
    }
    
}

