package com.cwgx.ses_inventory.rest;

import com.cwgx.ses_inventory.model.Item;
import com.cwgx.ses_inventory.repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ItemResource {
    @Autowired
    private ItemRepository itemRepository;

    @RequestMapping(path = "/item", method = RequestMethod.GET)
    public @ResponseBody Iterable<Item> getAllUsers() {
        // This returns a JSON or XML with the users
        return itemRepository.findAll();
    }

    @RequestMapping(path = "/item/{itemId}", method = RequestMethod.GET)
    public @ResponseBody Item userFindByName(@PathVariable String itemId) {
        // This returns a JSON or XML with the users
        return itemRepository.itemFindByName(itemId);
    }

    @PostMapping("/item/post")
    Item newCategory(@RequestBody Item newCategory){
        return itemRepository.save(newCategory);
    }
}
