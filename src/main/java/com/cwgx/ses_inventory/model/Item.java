package com.cwgx.ses_inventory.model;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "Item")
public class Item {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id_Item;
    private Integer category_id;
    @Length(min=5, max=45)
    private String name;
    @Length(min=5, max=45)
    private String description;
    @Length(min=5, max=45)
    private String taxable_value;
    @Length(min=5, max=45)
    private String status;
    @Length(min=5, max=45)
    private String tax_exempt_code;

    public Integer getId_Item() {
        return id_Item;
    }
    public void setId_Item(Integer id_Item) {
        this.id_Item = id_Item;
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
    public String getTaxable_value() {
        return taxable_value;
    }
    public void setTaxable_value(String taxable_value) {
        this.taxable_value = taxable_value;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getTax_exempt_code() {
        return tax_exempt_code;
    }
    public void setTax_exempt_code(String tax_exempt_code) {
        this.tax_exempt_code = tax_exempt_code;
    }

}
