package com.cwgx.ses_inventory.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "item_inventory_history")
public class ItemInventoryHistory {

    private Integer item_inventory;
    //private Integer beginning_unit_count;
    private Integer gross_sales_unit_count;
    private Integer return_to_vendor_unit_count;
    private Integer ending_unit_count;
    private Integer return_unit_count;
    private Integer tranfer_in_unit_count;
    private Integer transfer_out_unit_count;
    private Date timestamp;

    public Integer getItem_inventory() {
        return item_inventory;
    }

    public void setItem_inventory(Integer item_inventory) {
        this.item_inventory = item_inventory;
    }

    public Integer getGross_sales_unit_count() {
        return gross_sales_unit_count;
    }

    public void setGross_sales_unit_count(Integer gross_sales_unit_count) {
        this.gross_sales_unit_count = gross_sales_unit_count;
    }

    public Integer getReturn_to_vendor_unit_count() {
        return return_to_vendor_unit_count;
    }

    public void setReturn_to_vendor_unit_count(Integer return_to_vendor_unit_count) {
        this.return_to_vendor_unit_count = return_to_vendor_unit_count;
    }

    public Integer getEnding_unit_count() {
        return ending_unit_count;
    }

    public void setEnding_unit_count(Integer ending_unit_count) {
        this.ending_unit_count = ending_unit_count;
    }

    public Integer getReturn_unit_count() {
        return return_unit_count;
    }

    public void setReturn_unit_count(Integer return_unit_count) {
        this.return_unit_count = return_unit_count;
    }

    public Integer getTranfer_in_unit_count() {
        return tranfer_in_unit_count;
    }

    public void setTranfer_in_unit_count(Integer tranfer_in_unit_count) {
        this.tranfer_in_unit_count = tranfer_in_unit_count;
    }

    public Integer getTransfer_out_unit_count() {
        return transfer_out_unit_count;
    }

    public void setTransfer_out_unit_count(Integer transfer_out_unit_count) {
        this.transfer_out_unit_count = transfer_out_unit_count;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}