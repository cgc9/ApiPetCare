package com.udea.petcare.Services;

import com.udea.petcare.Models.User;
import com.udea.petcare.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User findById(Integer id){
        return  userRepository.findById(id).orElse(null);
    }

    public List<User> findAllUsers(){
        return userRepository.findAll();
    }

    public User findByEmail(String email){
        return  userRepository.findByEmail(email);
    }

    public User createUser(User user){
        return userRepository.save(user);

    }

    public User updateUser(User user){
        return userRepository.save(user);
    }
}
