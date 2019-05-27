package com.tuficha.tuficha.controller;

import com.tuficha.tuficha.dto.Row;
import com.tuficha.tuficha.repository.TokenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*",methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE})
@RestController
@RequestMapping("/consulta")


public class QryController {

    @Autowired
    private TokenRepository tokenRepository;

    @GetMapping("/")
    public Iterable<Row> getRows(){return tokenRepository.getRows();}

}
