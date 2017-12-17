package com.example.adressbook.repository;

import com.example.adressbook.domain.Adress;
import org.springframework.data.repository.CrudRepository;

public interface AdressRespository extends CrudRepository<Adress, Integer> {
}
