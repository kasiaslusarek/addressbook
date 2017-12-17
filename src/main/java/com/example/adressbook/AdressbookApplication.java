package com.example.adressbook;

import com.example.adressbook.domain.Adress;
import com.example.adressbook.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.adressbook.service.AdressBookService;
import com.example.adressbook.service.AdressService;
import com.example.adressbook.service.PersonService;

@SpringBootApplication
public class AdressbookApplication implements CommandLineRunner{

	@Autowired
	AdressBookService adressBookService;
	@Autowired
	AdressService adressService;
	@Autowired
	PersonService personService;

	public static void main(String[] args) {
		SpringApplication.run(AdressbookApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Adress adress1 = new Adress("London","Long","78-009","98");
		adressService.addAdress(adress1);

		Person person1 = new Person("Arnold", "Kowalski","17", adress1);
		personService.addUser(person1);
	}
}
