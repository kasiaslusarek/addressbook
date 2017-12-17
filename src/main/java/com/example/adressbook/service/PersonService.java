package com.example.adressbook.service;

import com.example.adressbook.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.adressbook.repository.PersonRepository;

@Service
public class PersonService {
    @Autowired
    PersonRepository personRepository;

    public void addUser(Person person){
        personRepository.save(person);
    }
}
