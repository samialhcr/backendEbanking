package com.example.demo.controller;

import com.example.demo.models.Agence;
import com.example.demo.services.AgenceService;
import com.example.demo.services.AgenceServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/admin")
public class AgenceApi {

    @Autowired
    private AgenceServiceI agenceService;

    @RequestMapping(value="/agence",method = RequestMethod.POST)
    public Agence saveAgence(@RequestBody Agence agence) {
        return agenceService.saveAgence(agence);
    }
    @RequestMapping(value="/agence/{id}",method = RequestMethod.GET)
    public Agence getAgence(@PathVariable long id) {
        return agenceService.getAgence(id);
    }
    @RequestMapping(value="/agences",method = RequestMethod.GET)
    public List<Agence> getAgences() {
        return agenceService.getAgences();
    }
    @RequestMapping(value="/agence",method = RequestMethod.PUT)
    public Agence updateAgence(@RequestBody  Agence agence) {
        return  agenceService.updateAgence(agence);

    }
    @RequestMapping(value="/agence/delete/{id}")
    public void deleteAgence(@PathVariable long id) {
         agenceService.deleteAgence(id);
    }
}
