package com.cwgx.ses_inventory.model;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "item_inventory")
public class ItemInventory {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id_item_inventory;
    private Integer location_id;
    //private Integer beginning_unit_count;
    private Integer gross_sales_unit_count;
    private Integer received_unit_count;
    private Integer return_to_vendor_unit_count;
    private Integer current_unit_count;
    private Integer return_unit_count;
    private Integer transfer_in_unit_count;
    private Integer transfer_out_unit_count;

    public Integer getId_item_inventory() {
        return id_item_inventory;
    }

    public void setId_item_inventory(Integer id_item_inventory) {
        this.id_item_inventory = id_item_inventory;
    }

    public Integer getLocation_id() {
        return location_id;
    }

    public void setLocation_id(Integer location_id) {
        this.location_id = location_id;
    }
/*
    public Integer getBeginning_unit_count() {
        return beginning_unit_count;
    }

    public void setBeginning_unit_count(Integer begining_unit_count) {
        this.beginning_unit_count = begining_unit_count;
    }
*/
    public Integer getGross_sales_unit_count() {
        return gross_sales_unit_count;
    }

    public void setGross_sales_unit_count(Integer gross_sales_unit_count) {
        this.gross_sales_unit_count = gross_sales_unit_count;
    }

    public Integer getReceived_unit_count() {
        return received_unit_count;
    }

    public void setReceived_unit_count(Integer received_unit_count) {
        this.received_unit_count = received_unit_count;
    }

    public Integer getReturn_to_vendor_unit_count() {
        return return_to_vendor_unit_count;
    }

    public void setReturn_to_vendor_unit_count(Integer return_to_vendor_unit_count) {
        this.return_to_vendor_unit_count = return_to_vendor_unit_count;
    }

    public Integer getCurrent_unit_count() {
        return current_unit_count;
    }

    public void setCurrent_unit_count(Integer current_unit_count) {
        this.current_unit_count = current_unit_count;
    }

    public Integer getReturn_unit_count() {
        return return_unit_count;
    }

    public void setReturn_unit_count(Integer return_unit_count) {
        this.return_unit_count = return_unit_count;
    }

    public Integer getTransfer_in_unit_count() {
        return transfer_in_unit_count;
    }

    public void setTransfer_in_unit_count(Integer transfer_in_unit_count) {
        this.transfer_in_unit_count = transfer_in_unit_count;
    }

    public Integer getTransfer_out_unit_count() {
        return transfer_out_unit_count;
    }

    public void setTransfer_out_unit_count(Integer transfer_out_unit_count) {
        this.transfer_out_unit_count = transfer_out_unit_count;
    }
}