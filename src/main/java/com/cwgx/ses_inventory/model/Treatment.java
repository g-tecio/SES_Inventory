package com.cwgx.ses_inventory.model;
import javax.persistence.*;
@Entity // This tells Hibernate to make a table out of this class
@Table(name = "treatment")
public class Treatment {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id_treatment;
    private String treatment_desc;

    public Integer getId_treatment() {
        return id_treatment;
    }

    public void setId_treatment(Integer id_treatment) {
        this.id_treatment = id_treatment;
    }

    public String getTreatment_desc() {
        return treatment_desc;
    }

    public void setTreatment_desc(String treatment_desc) {
        this.treatment_desc = treatment_desc;
    }
}
