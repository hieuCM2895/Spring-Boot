package com.example.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Address {

    private String street;

    private String houseNumber;

    private String city;

    private String country;

    @Autowired
    public Address(String street, String houseNumber, String city, String country) {
        this.street = street;
        this.houseNumber = houseNumber;
        this.city = city;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", houseNumber='" + houseNumber + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}