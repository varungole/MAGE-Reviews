package com.softwareENPM.ENPM.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    public User findByUsername(String username)
    {
        return userRepository.findByUsername(username);
    }

    public User createUser(User user)
    {
        return userRepository.save(user);
    }

    public User updateUser(User user, Long id)
    {
        user.setId(id);
        return userRepository.save(user);
    }

    public void deleteUser(Long id)
    {
        userRepository.deleteById(id);
    }   
}
