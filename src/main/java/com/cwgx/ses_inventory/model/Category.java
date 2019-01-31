package com.cwgx.ses_inventory.model;
import org.hibernate.validator.constraints.Length;
import javax.persistence.*;
@Entity // This tells Hibernate to make a table out of this class
@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id_category;
    @Length(min=5, max=45)
    private String name;
    @Length(min=5, max=45)
    private String description;
    @Length(min=5, max=45)
    private String status;

    public Integer getId_category() {
        return id_category;
    }
    public void setId_category(Integer id_category) {
        this.id_category = id_category;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
}
