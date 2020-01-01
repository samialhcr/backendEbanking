package com.example.demo.services;

import com.example.demo.models.Agence;

import java.util.List;

public interface AgenceServiceI {

    public Agence saveAgence(Agence agence);
    public  Agence getAgence(long id);
    public List<Agence> getAgences();
    public  Agence updateAgence(Agence agence);
    public  void deleteAgence(long id);

}
