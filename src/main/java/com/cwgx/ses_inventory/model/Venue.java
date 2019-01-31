package com.cwgx.ses_inventory.model;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "venue")
public class Venue {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id_venue;
    @Length(min=5, max=45)
    private String name;
    @Length(min=5, max=45)
    private String address_line1;
    @Length(min=5, max=45)
    private String address_line2;
    @Length(min=5, max=45)
    private String city;
    @Length(min=5, max=45)
    private String state;
    @Length(min=5, max=45)
    private String zip_code;
    @Length(min=5, max=45)
    private String country;

    public Integer getId_venue() {
        return id_venue;
    }
    public void setId_venue(Integer id_venue) {
        this.id_venue = id_venue;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress_line1() {
        return address_line1;
    }
    public void setAddress_line1(String address_line1) {
        this.address_line1 = address_line1;
    }
    public String getAddress_line2() {
        return address_line2;
    }
    public void setAddress_line2(String address_line2) {
        this.address_line2 = address_line2;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getZip_code() {
        return zip_code;
    }
    public void setZip_code(String zip_code) {
        this.zip_code = zip_code;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
}
