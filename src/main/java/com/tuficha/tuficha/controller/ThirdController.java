package com.tuficha.tuficha.controller;

import com.tuficha.tuficha.domain.Third;
import com.tuficha.tuficha.repository.QueryFilterRepository;
import com.tuficha.tuficha.repository.ThirdRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@CrossOrigin(origins = "*",methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE})
@RestController
@RequestMapping ("/thirds")
public class ThirdController {

    @Autowired
    private ThirdRepository thirdRepository;
    private QueryFilterRepository queryFilterRepository;

//    @PostMapping("/save")
//    public Third saveThird(@RequestBody Third third){
//        return this.thirdRepository.save(third);
//    }

    @PostMapping("/save")
    public ResponseEntity saveThird(@RequestBody Third third){
        if (third.getIdentification()!="" && third.getName()!=""     && third.getId_section()!=0 &&
                third.getId_profile()!=0      && third.getPassword()!="" && third.getId_eps()!=0     &&
                third.getId_arl()!=0          && third.getPhone()!=""    && third.getRh()!="")  {
            this.thirdRepository.save(third);
            return new ResponseEntity<>(HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
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

    @GetMapping("/condition/{condition}/value/{value}")
    public Iterable<Third> getFilter(@PathVariable String condition, String value){
        HashMap hashMap= new HashMap();
        hashMap.put(condition,value);
        return this.queryFilterRepository.getData(hashMap);
    }

    @DeleteMapping("/{thirdId}")
    public ResponseEntity deleteThird(@PathVariable Long thirdId){
        try {
            this.thirdRepository.deleteById(thirdId);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (EmptyResultDataAccessException e){
            System.out.println("Fallo delete");
        }
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
}

