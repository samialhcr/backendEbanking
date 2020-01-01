package com.example.demo.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Agence implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String city;
    private String address;
    @JsonBackReference
    @OneToMany(mappedBy = "agence",fetch = FetchType.LAZY)
    private List<ChargeClientel> chargeClientels;

    public Agence() {
    }

    public Agence(String name, String city, String address, List<ChargeClientel> chargeClientels) {
        this.name = name;
        this.city = city;
        this.address = address;
        this.chargeClientels = chargeClientels;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getAddress() {
        return address;
    }

    public List<ChargeClientel> getChargeClientels() {
        return chargeClientels;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setChargeClientels(List<ChargeClientel> chargeClientels) {
        this.chargeClientels = chargeClientels;
    }
}