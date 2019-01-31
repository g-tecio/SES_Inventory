package com.cwgx.ses_inventory.rest;


import com.cwgx.ses_inventory.model.ItemInventory;
import com.cwgx.ses_inventory.repositories.ItemInventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RestController
public class ItemInventoryResource {

    @Autowired
    private ItemInventoryRepository itemInventoryRepository;

    @RequestMapping(path = "/itemInventory", method = RequestMethod.GET)
    public @ResponseBody
    Iterable<ItemInventory> getAllItems() {
        // This returns a JSON or XML with the users
        return itemInventoryRepository.findAll();
    }
    @PostMapping("/itemInventory/post")
    ItemInventory newItem(@RequestBody ItemInventory newItem){
        return itemInventoryRepository.save(newItem);
    }
}