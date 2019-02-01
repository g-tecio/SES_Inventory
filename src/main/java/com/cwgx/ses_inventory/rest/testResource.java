package com.cwgx.ses_inventory.rest;

import com.cwgx.ses_inventory.model.test;
import com.cwgx.ses_inventory.repositories.testRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class testResource {
    @Autowired
    private testRepository testRepository;

    @PostMapping("/itemfull/post")
    test newitemimage(@RequestBody test newitemimage){
        return testRepository.save(newitemimage);
    }
}
