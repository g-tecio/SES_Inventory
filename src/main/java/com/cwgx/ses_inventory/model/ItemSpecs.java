package com.cwgx.ses_inventory.model;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "item_specs")
public class ItemSpecs {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)

    private Integer specs_id;

    private String color;

    private String version;

    private String model;

    private Integer release_year;

    private String description;

    public Integer getSpecs_id() {
        return specs_id;
    }

    public void setSpecs_id(Integer specs_id) {
        this.specs_id = specs_id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getRelease_year() {
        return release_year;
    }

    public void setRelease_year(Integer release_year) {
        this.release_year = release_year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
