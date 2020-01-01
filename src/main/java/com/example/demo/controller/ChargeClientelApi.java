package com.example.demo.controller;

import com.example.demo.models.ChargeClientel;
import com.example.demo.services.ChargeClienteleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/admin")
public class ChargeClientelApi {

    @Autowired
    private ChargeClienteleService chargeClienteleService;

    @RequestMapping(value="/charge-clientel",method = RequestMethod.POST)
    public ChargeClientel saveAgence(@RequestBody ChargeClientel chargeClientel) {
        return chargeClienteleService.saveChargeClientele(chargeClientel);
    }
    @RequestMapping(value="charge-clientel/{id}",method = RequestMethod.GET)
    public ChargeClientel getChargeClientel(@PathVariable long id) {
        return chargeClienteleService.getChargeClientele(id);
    }
    @RequestMapping(value="/charges-clientel",method = RequestMethod.GET)
    public List<ChargeClientel> getChargeClientels() {
        return chargeClienteleService.getChargeClienteles();
    }
    @RequestMapping(value="/charge-clientel",method = RequestMethod.PUT)
    public ChargeClientel updateAgence(@RequestBody ChargeClientel chargeClientel) {
        return  chargeClienteleService.updateChargeClientele(chargeClientel);

    }
    @RequestMapping(value="/charge-clientel/delete/{id}")
    public void deleteAgence(@PathVariable long id) {
        chargeClienteleService.deleteChargeClientele(id);
    }
}
