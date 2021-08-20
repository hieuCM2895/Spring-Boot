package com.example.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NestedObject {

    private String name;

    private String email;

    private int age;

    private boolean isDeveloper;

    private Address address;

    @Autowired
    public NestedObject(String name, String email, int age, boolean isDeveloper, Address address) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.isDeveloper = isDeveloper;
        this.address = address;
    }

    public void display() {
        System.out.println("Test");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isDeveloper() {
        return isDeveloper;
    }

    public void setDeveloper(boolean developer) {
        isDeveloper = developer;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "NestedObject{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", isDeveloper=" + isDeveloper +
                ", address=" + address +
                '}';
    }
}
