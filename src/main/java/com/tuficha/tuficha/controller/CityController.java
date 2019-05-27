package com.tuficha.tuficha.controller;

import com.tuficha.tuficha.domain.City;
import com.tuficha.tuficha.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins = "*",methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE})
@RestController
@RequestMapping("/cities")
public class CityController {

    @Autowired
    private CityRepository cityRepository;

    @PostMapping("/save")
    public City saveCity(@RequestBody City city){
        return this.cityRepository.save(city);
    }

    @GetMapping("/")
    public Iterable<City> getCities(){ return cityRepository.findAll(); }

    @GetMapping("/{cityId}")
    public City getCity(@PathVariable Long cityId){
        City ciudad = this.cityRepository.findById(cityId).orElse(null);
        return ciudad;
    }

    @DeleteMapping("/{cityId}")
    public ResponseEntity deleteCity(@PathVariable Long cityId){
        try {
            this.cityRepository.deleteById(cityId);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        catch (EmptyResultDataAccessException e){
            System.out.println("Fallo delete");
        }
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
}
