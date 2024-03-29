package com.cwgx.ses_inventory.rest;

import com.cwgx.ses_inventory.model.User;
import com.cwgx.ses_inventory.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class UserResource {
    @Autowired
    private UserRepository userRepository;

    @RequestMapping(path = "/users", method = RequestMethod.GET)
    public @ResponseBody Iterable<User> getAllUsers() {
        // This returns a JSON or XML with the users
        return userRepository.findAll();
    }

}