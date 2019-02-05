package com.cwgx.ses_inventory.model;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
 // This tells Hibernate to make a table out of this class
//@Table(name = "item")
//@Table(name = "category")
public class ItemCreation {
   public Item item;
   public Category category;

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
