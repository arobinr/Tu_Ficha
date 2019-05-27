package com.tuficha.tuficha.domain;

import javax.persistence.*;

@Entity
@SequenceGenerator(name = "token_id_seq", allocationSize = 1, sequenceName = "token_id_seq")
public class Token {

    @Id
//    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "token_id_seq")
    private Long id;


    private Long id_third;

    public Token() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId_third() {
        return id_third;
    }

    public void setId_third(Long id_third) {
        this.id_third = id_third;
    }
}
