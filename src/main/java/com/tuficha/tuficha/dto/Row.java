package com.tuficha.tuficha.dto;

public class Row {
    private String name;
    private String id;
    private String phone;
    private String rh;
    private String profile;
    private String eps;
    private String arl;
    private String section;
    private String city;

    public Row(String name, String id, String phone, String rh, String profile, String eps, String arl, String section, String city) {
        this.name = name;
        this.id = id;
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

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
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

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getSection() {
        return section;
    }

    public String getCity() {
        return city;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
