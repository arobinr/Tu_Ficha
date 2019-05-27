package com.tuficha.tuficha.domain;

import javax.persistence.*;

@Entity
@SequenceGenerator(name = "section_id_seq", allocationSize = 1, sequenceName = "section_id_seq")
public class Section {

    @Id
    private Long id;
    private String name;
    private Long id_city;

    public Section() {

    }

    public Long getId_city() {
        return id_city;
    }

    public void setId_city(Long id_city) {
        this.id_city = id_city;
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
