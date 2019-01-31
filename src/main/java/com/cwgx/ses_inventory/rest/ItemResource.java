package com.cwgx.ses_inventory.rest;

import com.cwgx.ses_inventory.model.Item;
import com.cwgx.ses_inventory.repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RestController
public class ItemResource {

    @Autowired
    private ItemRepository itemRepository;

    @RequestMapping(path = "/items", method = RequestMethod.GET)
    public @ResponseBody
    Iterable<Item> getAllItems() {
        // This returns a JSON or XML with the users
        return itemRepository.findAll();
    }
    @PostMapping("/item/post")
    Item newItem(@RequestBody Item newItem){
        return itemRepository.save(newItem);
    }
}