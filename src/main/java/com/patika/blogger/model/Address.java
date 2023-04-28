package com.patika.blogger.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.patika.blogger.model.Gender;
import com.patika.blogger.model.User;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Entity
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Address implements Serializable {
    private long id;
    private String city;
    private String street;
    private String building;
    private long postCode;
    private int apartmentNumber;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public long getPostCode() {
        return postCode;
    }

    public void setPostCode(long postCode) {
        this.postCode = postCode;
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(int apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public Address(String city, String street, String building, long postCode, int apartmentNumber) {
        this.city = city;
        this.street = street;
        this.building = building;
        this.postCode = postCode;
        this.apartmentNumber = apartmentNumber;
    }
}