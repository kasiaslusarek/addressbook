package com.example.adressbook.repository;

import com.example.adressbook.domain.Adress;
import com.example.adressbook.domain.Person;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PersonRepository extends CrudRepository<Person,Integer> {
}

