package com.patika.blogger.model;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import com.patika.blogger.model.Address;


@Entity
@JsonInclude(JsonInclude.Include.NON_NULL)
public class User implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @OneToOne
    private Address address;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private Gender gender;
    private String picturePath;
    //@OneToMany(cascade  = CascadeType.ALL)

    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date hiringDate;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date birthDate;    
    
    //@ManyToOne
    private User manager;
    
    private EducationState educationState;


    public static User findOne(User user) {
        return user;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getPicturePath() {
        return picturePath;
    }

    public void setPicturePath(String picturePath) {
        this.picturePath = picturePath;
    }





    public Date getHiringDate() {
        return hiringDate;
    }

    public void setHiringDate(Date hiringDate) {
        this.hiringDate = hiringDate;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public User getManager() {
        return manager;
    }

    public void setManager(User manager) {
        this.manager = manager;
    }

    public EducationState getEducationState() {
        return educationState;
    }

    public void setEducationState(EducationState educationState) {
        this.educationState = educationState;
    }



    public User(long id, String firstName, String lastName, String emailAddress, Gender gender, Date hiringDate, User manager) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.gender = gender;
        this.hiringDate = hiringDate;
        this.manager = manager;
        
        System.out.println(getLastName());
    }
    
    public User()
    {
        ;
    }


    public String getUserName() {
        return null;
    }
}
