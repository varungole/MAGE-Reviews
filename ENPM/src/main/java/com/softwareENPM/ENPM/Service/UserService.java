package com.softwareENPM.ENPM.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

import com.softwareENPM.ENPM.Entity.User;
import com.softwareENPM.ENPM.Repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getUsers()
    {
        return userRepository.findAll();
    }

    public User createUser(User user)
    {
        return userRepository.save(user);
    }

    public User updateUser(User user, Integer id)
    {
        user.setId(id);
        return userRepository.save(user);
    }

    public User getUserById(Integer id)
    {
        return userRepository.findById(id).orElse(null);
    }

    
}
