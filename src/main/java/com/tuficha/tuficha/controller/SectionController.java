package com.tuficha.tuficha.controller;

import com.tuficha.tuficha.domain.Section;
import com.tuficha.tuficha.repository.SectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin(origins = "*",methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE})
@RestController
@RequestMapping("/sections")
public class SectionController {

    @Autowired
    private SectionRepository sectionRepository;

    @PostMapping("/save")
    public Section saveSection(@RequestBody Section section){
        return this.sectionRepository.save(section);
    }

    @GetMapping("/")
    public Iterable<Section> getSections(){ return sectionRepository.findAll(); }

    @GetMapping("/{sectionId}")
    public Section getSection(@PathVariable Long sectionId){
        Section section = this.sectionRepository.findById(sectionId).orElse(null);
        return section;
    }

    @DeleteMapping("/{sectionId}")
    public ResponseEntity deleteSection(@PathVariable Long sectionId){
        try {
            this.sectionRepository.deleteById(sectionId);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        catch (EmptyResultDataAccessException e){
            System.out.println("Fallo delete");
        }
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
}
