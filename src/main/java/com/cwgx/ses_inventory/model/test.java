package com.cwgx.ses_inventory.model;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "item")
@SecondaryTable(name = "item_image")
public class test{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id_item;
    private Integer category_id;
    @Length(min=5, max=45)
    private String name;
    @Length(min=5, max=45)
    private String description;
    private Float taxable_value;
    private String status;
    private Integer tax_exempt_code;


    /*@Column(table = "item_image")
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id_item_image;*/
    @Column(table = "item_image")
    private Integer item_id;
    //@Length(min=5, max=45)
    @Column(table = "item_image")
    private String source;
    @Column(table = "item_image")
    private String created_at;
    @Length(min=5, max=45)
    @Column(table = "item_image")
    private String status_image;


    public Integer getId_item() {
        return id_item;
    }
    public void setId_item(Integer id_item) {
        this.id_item = id_item;
    }
    public Integer getCategory_id() {
        return category_id;
    }
    public void setCategory_id(Integer category_id) {
        this.category_id = category_id;
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
    public Float getTaxable_value() {
        return taxable_value;
    }
    public void setTaxable_value(Float taxable_value) {
        this.taxable_value = taxable_value;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public Integer getTax_exempt_code() {
        return tax_exempt_code;
    }
    public void setTax_exempt_code(Integer tax_exempt_code) {
        this.tax_exempt_code = tax_exempt_code;
    }
    /*
    public Integer getId_item_image() {
        return id_item_image;
    }
    public void setId_item_image(Integer id_item_image) {
        this.id_item_image = id_item_image;
    }*/
    public Integer getItem_id() {
        return item_id;
    }
    public void setItem_id(Integer item_id) {
        this.item_id = item_id;
    }
    public String getSource() {
        return source;
    }
    public void setSource(String source) {
        this.source = source;
    }
    public String getCreated_at() {
        return created_at;
    }
    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }
    public String getStatus_image() {
        return status_image;
    }
    public void setStatus_image(String status_image) {
        this.status_image = status_image;
    }
}
