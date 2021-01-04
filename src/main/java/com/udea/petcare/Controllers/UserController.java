package com.udea.petcare.Controllers;


import com.udea.petcare.Models.User;
import com.udea.petcare.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping(path="/")
    public List<User> getAllUsers() {
        return userService.findAllUsers();
    }

    @GetMapping(path = "/{id}")
    public User getUserById(@PathVariable Integer id){
        return userService.findById(id);
    }

    @GetMapping(path = "/email/{email}")
    public User getUserByEmail(@PathVariable String email){
        return userService.findByEmail(email);
    }

    @PostMapping("/")
    public User createUser(@RequestBody User user){
        return userService.createUser(user);
    }

    /*@PutMapping("/{id}")
    public User updateUser(@PathVariable Integer id,@RequestBody User user){
        User userUp=userService.findById(id);

        if(userUp==null){
            System.out.printf("No existe");
            return null;
        }

        userUp.se
    }*/
}
