package com.tuficha.tuficha.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
@SequenceGenerator(name = "affiliation_id_seq", allocationSize = 1, sequenceName = "affiliation_id_seq")
public class Affiliation {

    @Id
//    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "affiliation_id_seq")
    private Long id;

    private String name;

    private String type;

    public Affiliation() {
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Affiliation that = (Affiliation) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(name, that.name) &&
                Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, type);
    }

    @Override
    public String toString() {
        return "Affiliation{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
