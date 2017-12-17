package com.example.adressbook.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Adress {
    private String city;
    private String street;
    private String code;

    public Adress() {
    }

    @Id
    @GeneratedValue
    private  Integer id;

    public Adress(String city, String street, String code, String housesNumber) {
        this.city = city;
        this.street = street;
        this.code = code;
        this.housesNumber = housesNumber;
    }

    private String housesNumber;

    @Override
    public String toString() {
        return "Adress{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", code='" + code + '\'' +
                ", housesNumber='" + housesNumber + '\'' +
                '}';
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getHousesNumber() {
        return housesNumber;
    }

    public void setHousesNumber(String housesNumber) {
        this.housesNumber = housesNumber;
    }
}
