package com.patika.blogger.controller;

import com.patika.blogger.model.Gender;
import com.patika.blogger.model.UserModel;
import com.patika.blogger.repository.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping(path = "/getUsers")
    public List<UserModel> getUser() {
        return userRepository.findAll();
    }

    @GetMapping(path = "/setUser")
    public void setUser() {

        UserModel newUser = new UserModel("Sinan", "Kazan", "sinankaza@gmail.com", Gender.MALE, null, null);
        System.out.println("Burada");
        userRepository.save(newUser);
    }

    @PostMapping(path = "/postUser")
    public UserModel save(@RequestBody UserModel user) {
        
        if (user.getFirstName() == null){
            return null;
        }
        
       return  userRepository.save(user);
    }

}
