package com.example.demo.models;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class ChargeClientel extends Utilisateurs implements Serializable {

    private String  cin;
    private String  firstName;
    private String lastName;
    private String  address;
    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "id_agence")
    private Agence agence;

    public ChargeClientel() {
        super();
    }

    public ChargeClientel(Long id, String email,String username,String cin, String firstName, String lastNmae, String address, Agence agence) {
        super(id,email,username);
        this.cin = cin;
        this.firstName = firstName;
        this.lastName = lastNmae;
        this.address = address;
        this.agence = agence;
    }


    public String getCin() {
        return cin;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }


    public String getAddress() {
        return address;
    }

    public Agence getAgence() {
        return agence;
    }


    public void setCin(String cin) {
        this.cin = cin;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public void setAddress(String address) {
        this.address = address;
    }

    public void setAgence(Agence agence) {
        this.agence = agence;
    }

}
