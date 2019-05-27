package com.tuficha.tuficha.controller;

import com.tuficha.tuficha.domain.Profile;
import com.tuficha.tuficha.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins = "*",methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE})
@RestController
@RequestMapping("/profiles")
public class ProfileController {

    @Autowired
    private ProfileRepository profileRepository;

    @GetMapping("/")
    public Iterable<Profile> getProfiles(){
        return profileRepository.findAll();
    }

    @GetMapping("/{profileId}")
    public Profile getProfile(@PathVariable Long profileId){
        Profile profile = this.profileRepository.findById(profileId).orElse(null);
        return profile;
    }

//    @PostMapping("/save")
//    public Profile saveProfile(@RequestBody Profile profile){
//        return this.profileRepository.save(profile);
//    }

    @PostMapping("/save")
    public ResponseEntity saveProfile(@RequestBody Profile profile){
        if (profile.getName()!=""){
            this.profileRepository.save(profile);
            return new ResponseEntity<>(HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }


    @DeleteMapping("/{profileId}")
    public ResponseEntity deleteProfile(@PathVariable Long profileId){
        try {
            this.profileRepository.deleteById(profileId);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (EmptyResultDataAccessException e){
            System.out.println("Fallo delete");
        }
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

}
