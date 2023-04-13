package com.patika.blogger.controller;

import com.patika.blogger.model.User;
import com.patika.blogger.repository.UserRepository;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping(path = "get-users")
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @GetMapping(path = "get-user", params = "id")
    public Optional<User> getUser(@RequestParam("id") Long userId) {

        return userRepository.findById(userId);


    }

    @PostMapping(path = "post-user")
    public User save(@RequestBody User user) {

        if (user.getFirstName() == null){
            return null;
        }

        return  userRepository.save(user);
    }

}
