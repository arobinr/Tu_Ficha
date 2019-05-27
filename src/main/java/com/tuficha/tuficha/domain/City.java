package com.tuficha.tuficha.domain;

import javax.persistence.*;

@Entity
@SequenceGenerator(name = "city_id_seq", allocationSize = 1, sequenceName = "city_id_seq")
public class City {

    @Id
    private Long id;
    private String name;

    public City() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
