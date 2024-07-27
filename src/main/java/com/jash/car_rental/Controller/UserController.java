package com.jash.car_rental.Controller;

import com.jash.car_rental.Entity.User;
import com.jash.car_rental.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/user")
    public User addUser(@RequestBody User user){
        return userRepository.save(user);
    }

    @GetMapping("/user/{id}")
    public Optional<User> getUser(@PathVariable int userId){
        Optional<User> user=userRepository.findById(userId);
        if(user.isPresent()){
            return user;
        }
        throw new RuntimeException("User with given id is not present.");
    }

    @PutMapping("/user/{id}")
    public User updateUser(@RequestBody User user,@PathVariable int userId){
        try{
            Optional<User> user1=userRepository.findById(userId);
            User newUser=user1.get();
            newUser.setEmail(user.getEmail());
            newUser.setId(user.getId());
            newUser.setFirstName(user.getFirstName());
            newUser.setRole(user.getRole());
            newUser.setPassword(user.getPassword());
            newUser.setLastName(user.getLastName());
            return userRepository.save(newUser);
        }
        catch (Exception e){
            return userRepository.save(user);
        }
    }
}
