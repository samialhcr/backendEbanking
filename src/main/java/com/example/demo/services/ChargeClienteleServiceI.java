package com.example.demo.services;

import com.example.demo.models.ChargeClientel;

import java.util.List;

public interface ChargeClienteleServiceI {

    public ChargeClientel saveChargeClientele(ChargeClientel chargeClientel);
    public ChargeClientel getChargeClientele(long id);
    public List<ChargeClientel> getChargeClienteles();
    public ChargeClientel updateChargeClientele(ChargeClientel chargeClientel);
    public  void deleteChargeClientele(long id);
}
