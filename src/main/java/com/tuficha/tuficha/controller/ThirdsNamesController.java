package com.tuficha.tuficha.controller;
import com.tuficha.tuficha.dto.Row;
import com.tuficha.tuficha.repository.TokenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*",methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE})
@RestController
@RequestMapping("/thirdsNames")
public class ThirdsNamesController {

    @Autowired
    private TokenRepository tokenRepository;

    @GetMapping("/")
        public Iterable<Row> getThirds(){  return tokenRepository.getThirds();}

}
