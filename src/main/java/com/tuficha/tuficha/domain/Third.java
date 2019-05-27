package com.tuficha.tuficha.domain;

import javax.persistence.*;

@Entity
@SequenceGenerator(name = "third_id_seq", allocationSize = 1, sequenceName = "third_id_seq")
public class Third {

    @Id
//    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "third_id_seq")
    private Long id;
    public  String identification;
    public  String name;
    public  Long id_section;
    public  Long id_profile;
    public  String password;
    public  Long id_eps;
    public  Long id_arl;
    public  String phone;
    public  String email;
    public  String rh;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId_section() {
        return id_section;
    }

    public void setId_section(Long id_section) {
        this.id_section = id_section;
    }

    public Long getId_profile() {
        return id_profile;
    }

    public void setId_profile(Long id_profile) {
        this.id_profile = id_profile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getId_eps() {
        return id_eps;
    }

    public void setId_eps(Long id_eps) {
        this.id_eps = id_eps;
    }

    public Long getId_arl() {
        return id_arl;
    }

    public void setId_arl(Long id_arl) {
        this.id_arl = id_arl;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRh() {
        return rh;
    }

    public void setRh(String rh) {
        this.rh = rh;
    }

    public Third() {
    }
}
