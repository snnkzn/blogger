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

public class Address {
    @Entity
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public class User implements Serializable {
        private String name;
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private long id;
        private String street;
        private String building;
        private int floor;
        private int postCode;
        private String state;
        private String userManager;
        private String address;
        public String getaddress(){return address;}
        public void setAddress(String address) {
            this.address = address;
        }



        public String getName() {
            return name;
        }

        public long getId() {
            return id;
        }

        public String getStreet() {
            return street;
        }

        public String getBuilding() {
            return building;
        }

        public int getFloor() {
            return floor;
        }

        public int getPostCode() {
            return postCode;
        }

        private String getState() {
            return state;
        }

        private String getUserManager() {
            return userManager;
        }


        public void setname(String name) {
            this.name = name;
        }

        public void setId(long id) {
            this.id = id;
        }

        public void setstreet(String street) {
            this.street = street;
        }

        public void setbuilding(String building) {
            this.building = building;
        }

        public void setfloor(int floor) {
            this.floor = floor;
        }

        public void setpostCode(int postCode) {
            this.postCode = postCode;
        }

        public void setstate(String state) {
            this.state = state;
        }

        public void setuserManager(String userManager) {
            this.userManager = userManager;
        }


        public User (String name, long id, String street, String building, int floor) {


        }
    }
}