package com.cwgx.ses_inventory.model;

import org.hibernate.validator.constraints.Length;
import javax.persistence.*;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "location")
public class Location {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id_location;
    private Integer venue_id;
    @Length(min=5, max=45)
    private String area;
    @Length(min=5, max=45)
    private String aisle;
    @Length(min=5, max=45)
    private String rack;
    @Length(min=5, max=45)
    private String description;

    public Integer getId_location() {
        return id_location;
    }
    public void setId_location(Integer id_location) {
        this.id_location = id_location;
    }
    public Integer getVenue_id() {
        return venue_id;
    }
    public void setVenue_id(Integer venue_id) {
        this.venue_id = venue_id;
    }
    public String getArea() {
        return area;
    }
    public void setArea(String area) {
        this.area = area;
    }
    public String getAisle() {
        return aisle;
    }
    public void setAisle(String aisle) {
        this.aisle = aisle;
    }
    public String getRack() {
        return rack;
    }
    public void setRack(String rack) {
        this.rack = rack;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}
