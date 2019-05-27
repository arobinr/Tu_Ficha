package com.tuficha.tuficha.controller;
import com.tuficha.tuficha.domain.Affiliation;
import com.tuficha.tuficha.repository.AffiliationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*",methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE})
@RestController
@RequestMapping("/affiliations")
public class AffiliationController {

    @Autowired
    private AffiliationRepository affiliationRepository;

    @GetMapping("/")
    public Iterable<Affiliation> getAffiliation(){
        return affiliationRepository.findAll();
    }

    @GetMapping("/{affiliationId}")
    public Affiliation getAffiliation(@PathVariable Long affiliationId){
        Affiliation affiliation = this.affiliationRepository.findById(affiliationId).orElse(null);
        return affiliation;
    }

//    @PostMapping("/save")
//    public Affiliation saveAffiliation(@RequestBody Affiliation affiliation){
//        return this.affiliationRepository.save(affiliation);
//    }

    @PostMapping("/save")
    public ResponseEntity saveAffiliation(@RequestBody Affiliation affiliation){
        if (affiliation.getName()!="" && affiliation.getType()!="" && (affiliation.getType().equals("E") || affiliation.getType().equals("A"))){
            this.affiliationRepository.save(affiliation);
            return new ResponseEntity<>(HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping("/{affiliationId}")
    public ResponseEntity deleteAffiliation(@PathVariable Long affiliationId){
        try {
            this.affiliationRepository.deleteById(affiliationId);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        catch (EmptyResultDataAccessException e){
            System.out.println("Fallo delete");
        }
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
}
