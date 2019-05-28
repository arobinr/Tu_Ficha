package com.tuficha.tuficha.dto;

public class Row {
    private Long id;
    private String name;
    private String identification;
    private String phone;
    private String rh;
    private String profile;
    private String eps;
    private String arl;
    private String section;
    private String city;

    public Row(Long id, String name, String identification, String phone, String rh, String profile, String eps, String arl, String section, String city) {
        this.id = id;
        this.name = name;
        this.identification = identification;
        this.phone = phone;
        this.rh = rh;
        this.profile = profile;
        this.eps = eps;
        this.arl = arl;
        this.section = section;
        this.city = city;
    }

    public Row(){

    }

//    public Row(String name){
//        this.name = name;
//    }

    public String getIdentification() {
        return identification;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setRh(String rh) {
        this.rh = rh;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public void setEps(String eps) {
        this.eps = eps;
    }

    public void setArl(String arl) {
        this.arl = arl;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getRh() {
        return rh;
    }

    public String getProfile() {
        return profile;
    }

    public String getEps() {
        return eps;
    }

    public String getArl() {
        return arl;
    }

    public String getSection() {
        return section;
    }

    public String getCity() {
        return city;
    }
}
