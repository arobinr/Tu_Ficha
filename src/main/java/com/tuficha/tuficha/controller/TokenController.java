package com.tuficha.tuficha.controller;


import com.tuficha.tuficha.domain.Token;
import com.tuficha.tuficha.repository.TokenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*",methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE})
@RestController
@RequestMapping("/tokens")
public class TokenController {

    @Autowired
    private TokenRepository tokenRepository;

    @GetMapping("/")
    public Iterable<Token> getTokens(){
        return tokenRepository.findAll();
    }

//    @PostMapping("/save")
//    public Token saveToken(@RequestBody Token token){
//        return this.tokenRepository.save(token);
//    }

    @PostMapping("/save")
    public ResponseEntity saveToken(@RequestBody Token token){
        if (token.getId_third() != 0){
            this.tokenRepository.save(token);
            return new ResponseEntity<>(HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping("/{TokenId}")
    public ResponseEntity deleteToken(@PathVariable Long tokenId){
        try {
            this.tokenRepository.deleteById(tokenId);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        catch (EmptyResultDataAccessException e){
            System.out.println("Fallo delete");
        }
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
}
