package com.tuficha.tuficha.domain;
import javax.persistence.*;

@Entity
@SequenceGenerator(name = "profile_id_seq", allocationSize = 1, sequenceName = "profile_id_seq")
public class Profile {

    @Id
//    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "profile_id_seq")
    private Long id;
    private String name;

    public Profile() {
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
