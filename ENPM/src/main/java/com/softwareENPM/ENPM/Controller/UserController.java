package com.softwareENPM.ENPM.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.softwareENPM.ENPM.Entity.User;
import com.softwareENPM.ENPM.Service.UserService;
import java.util.*;


@RestController
@RequestMapping("/api/users/v1")
public class UserController {
    
    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> getUser()
    {
        return userService.getUsers();
    }

    @GetMapping("/{username}")
    public User getUserbyId(@PathVariable String username)
    {
        return userService.findByUsername(username);
    }

    @PostMapping
    public User createUser(@RequestBody User user)
    {
        return userService.createUser(user);
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User user)
    {
        return userService.updateUser(user, id);
    }

    @DeleteMapping("/{id}")
    public void deleteUserById(@PathVariable Long id)
    {
        userService.deleteUser(id);
    }

}
