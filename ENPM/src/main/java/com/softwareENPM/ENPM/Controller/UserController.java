package com.softwareENPM.ENPM.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

import com.softwareENPM.ENPM.Entity.User;
import com.softwareENPM.ENPM.Service.UserService;

@RestController
@RequestMapping("api/users/v1")
public class UserController {
    
    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> getUsers()
    {
        return userService.getUsers();
    }

    @PostMapping
    public User createUser(@RequestBody User user)
    {
        return userService.createUser(user);
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable("id") Integer id)
    {
        return userService.getUserById(id);
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable("id") Integer id, @RequestBody User user)
    {
        return userService.updateUser(user, id);
    }
}
