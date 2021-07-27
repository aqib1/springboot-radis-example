package com.radis.io.controller;

import com.radis.io.entities.UserEntity;
import com.radis.io.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/get/{id}")
    public UserEntity getById(@RequestParam("id") Long id) {
     return userRepository.getById(id);
    }

    @GetMapping("/all")
    public List<UserEntity> getAll() {
        return userRepository.findAll();
    }

    @PostMapping("/add")
    public UserEntity add(@RequestBody UserEntity userEntity) {
        return userRepository.save(userEntity);
    }
}
