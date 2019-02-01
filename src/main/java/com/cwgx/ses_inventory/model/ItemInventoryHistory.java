package com.cwgx.ses_inventory.model;
import javax.persistence.*;
import java.util.Date;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "item_inventory_history")
public class ItemInventoryHistory {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer item_inventory_id;
    //private Integer beginning_unit_count;
    private Integer gross_sales_unit_count;
    private Integer return_to_vendor_unit_count;
    private Integer ending_unit_count;
    private Integer return_unit_count;
    private Integer transfer_in_unit_count;
    private Integer transfer_out_unit_count;
    private Date timestamp;

    public Integer getItem_inventory_id() {
        return item_inventory_id;
    }

    public void setItem_inventory_id(Integer item_inventory_id) {
        this.item_inventory_id = item_inventory_id;
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

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}
