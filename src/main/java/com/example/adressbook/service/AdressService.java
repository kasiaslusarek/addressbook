package com.example.adressbook.service;

import com.example.adressbook.domain.Adress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.adressbook.repository.AdressRespository;

@Service
public class AdressService {
    @Autowired
    AdressRespository adressRespository;
    public void addAdress(Adress adress){
        adressRespository.save(adress);
    }
}
