package com.projetospring.project.services;


import com.projetospring.project.entities.User;
import com.projetospring.project.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;


    public List<User> findAll() {
        return userRepository.findAll();

    }

    public User findById(Long id) {
        Optional<User> user = userRepository.findById(id);

        return user.get();
    }
}
