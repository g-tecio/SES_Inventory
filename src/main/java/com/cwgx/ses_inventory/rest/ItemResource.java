package com.cwgx.ses_inventory.rest;

import com.cwgx.ses_inventory.model.Category;
import com.cwgx.ses_inventory.model.Item;
import com.cwgx.ses_inventory.repositories.CategoryRepository;
import com.cwgx.ses_inventory.repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RestController
public class ItemResource {
    @Autowired
    private ItemRepository itemRepository;

    @RequestMapping(path = "/item", method = RequestMethod.GET)
    public @ResponseBody
    Iterable<Item> getAllUsers() {
        // This returns a JSON or XML with the users
        return itemRepository.findAll();
    }

    @RequestMapping(path = "/item/{itemName}", method = RequestMethod.GET)
    public @ResponseBody Item itemFindByName(@PathVariable String itemName) {
        // This returns a JSON or XML with the users
        return itemRepository.itemFindByName(itemName);
    }

    @PostMapping("/item/post")
    Item newItem(@RequestBody Item newItem){
        return itemRepository.save(newItem);
    }
}
