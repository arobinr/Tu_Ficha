package com.tuficha.tuficha.controller;

import com.tuficha.tuficha.domain.Third;
import com.tuficha.tuficha.repository.ThirdRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*",methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE})
@RestController
@RequestMapping ("/thirds")
public class ThirdController {

    @Autowired
    private ThirdRepository thirdRepository;

    @PostMapping("/save")
    public Third saveThird(@RequestBody Third third){
        return this.thirdRepository.save(third);
    }

    @GetMapping("/")
    public Iterable<Third> getThirds(){
        return thirdRepository.findAll();
    }

    @GetMapping("/{thirdId}")
    public Third getThird(@PathVariable Long thirdId){
        Third third = this.thirdRepository.findById(thirdId).orElse(null);
        return third;
    }

    @DeleteMapping("/{id_Third}")
    public ResponseEntity deleteThird(@RequestBody Long id_Third){
        try {
            this.thirdRepository.deleteById(id_Third);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (EmptyResultDataAccessException e){
            System.out.println("Fallo delete");
        }
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
}

