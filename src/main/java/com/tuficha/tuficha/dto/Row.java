package com.tuficha.tuficha.dto;

public class Row {
    private Long id;
    private String name;
    private String identification;
    private String phone;
    private String rh;
    private Long id_profile;
    private String profile;
    private Long id_eps;
    private String eps;
    private Long id_arl;
    private String arl;
    private Long id_section;
    private String section;
    private String city;

    public Row(Long id, String name, String identification, String phone, String rh, Long id_profile, String profile, Long id_eps, String eps, Long id_arl, String arl, Long id_section, String section, String city) {
        this.id = id;
        this.name = name;
        this.identification = identification;
        this.phone = phone;
        this.rh = rh;
        this.id_profile = id_profile;
        this.profile = profile;
        this.id_eps = id_eps;
        this.eps = eps;
        this.id_arl = id_arl;
        this.arl = arl;
        this.id_section = id_section;
        this.section = section;
        this.city = city;
    }

    public Row(){

    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getIdentification() {
        return identification;
    }

    public String getPhone() {
        return phone;
    }

    public String getRh() {
        return rh;
    }

    public Long getId_profile() {
        return id_profile;
    }

    public String getProfile() {
        return profile;
    }

    public Long getId_eps() {
        return id_eps;
    }

    public String getEps() {
        return eps;
    }

    public Long getId_arl() {
        return id_arl;
    }

    public String getArl() {
        return arl;
    }

    public Long getId_section() {
        return id_section;
    }

    public String getSection() {
        return section;
    }

    public String getCity() {
        return city;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setRh(String rh) {
        this.rh = rh;
    }

    public void setId_profile(Long id_profile) {
        this.id_profile = id_profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public void setId_eps(Long id_eps) {
        this.id_eps = id_eps;
    }

    public void setEps(String eps) {
        this.eps = eps;
    }

    public void setId_arl(Long id_arl) {
        this.id_arl = id_arl;
    }

    public void setArl(String arl) {
        this.arl = arl;
    }

    public void setId_section(Long id_section) {
        this.id_section = id_section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
