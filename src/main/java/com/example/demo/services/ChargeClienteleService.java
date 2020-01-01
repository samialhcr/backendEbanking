package com.example.demo.services;

import com.example.demo.models.ChargeClientel;
import com.example.demo.repository.ChargeClienteleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChargeClienteleService implements  ChargeClienteleServiceI {

    @Autowired
    ChargeClienteleRepository chargeClienteleRepository;

    @Override
    public ChargeClientel saveChargeClientele(ChargeClientel chargeClientel) {
        return chargeClienteleRepository.save(chargeClientel);
    }

    @Override
    public ChargeClientel getChargeClientele(long id) {
        return chargeClienteleRepository.getOne(id);
    }

    @Override
    public List<ChargeClientel> getChargeClienteles() {
        return chargeClienteleRepository.findAll();
    }

    @Override
    public ChargeClientel updateChargeClientele(ChargeClientel chargeClientel) {
        return chargeClienteleRepository.save(chargeClientel);
    }

    @Override
    public void deleteChargeClientele(long id) {
        chargeClienteleRepository.deleteById(id);
    }
}
