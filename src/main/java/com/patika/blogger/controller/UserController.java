package com.patika.blogger.controller;

import com.patika.blogger.model.Gender;
import com.patika.blogger.model.UserModel;
import com.patika.blogger.repository.UserModelRepository;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.management.Query;
import javax.persistence.EntityManager;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserModelRepository userRepository;

    @GetMapping(path = "/getUsers")
    public List<UserModel> getUser() {
        return userRepository.findAll();
    }


    @GetMapping(path = "/get-users-by-gender", params = {"gender"})
    public List<UserModel> getUsersByGender(@RequestParam(name = "gender") Gender gender) {
        return userRepository.findByGender(gender);
    }


    @GetMapping(path = "/get-users-by-name", params = {"firstName"})
    public List<UserModel> getUsersByName(@RequestParam(name = "firstName") String firstName) {
        ArrayList<UserModel> userModelList  = new ArrayList<UserModel>() ;


        try{
            return  userRepository.findByFirstName(firstName);
        }catch (Exception e){
            System.out.println(e);
        }

        return  null;

    }
    @GetMapping(path = "/setUser")
    public void setUser() {

        UserModel newUser = new UserModel("Sinan", "Kazan", "sinankaza@gmail.com", Gender.MALE, null, null);
        System.out.println("Burada");
        userRepository.save(newUser);
    }

    @PostMapping(path = "/postUser")
    public UserModel save(@RequestBody UserModel user) {

        if (user.getFirstName() == null) {
            return null;
        }
        return userRepository.save(user);
    }

}
