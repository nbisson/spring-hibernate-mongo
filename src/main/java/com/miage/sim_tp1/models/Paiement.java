package com.miage.sim_tp1.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
public class Paiement {

    @Id private String id;
    private String designation;
    private Date dateReception;
    private Float montant;
    private String mode;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Date getDateReception() {
        return dateReception;
    }

    public void setDateReception(Date dateReception) {
        this.dateReception = dateReception;
    }

    public Float getMontant() {
        return montant;
    }

    public void setMontant(Float montant) {
        this.montant = montant;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    @Override
    public String toString() {
        return "Paiement{" +
                "id=" + id +
                ", designation='" + designation + '\'' +
                ", dateReception=" + dateReception +
                ", montant=" + montant +
                ", mode='" + mode + '\'' +
                '}';
    }
}
