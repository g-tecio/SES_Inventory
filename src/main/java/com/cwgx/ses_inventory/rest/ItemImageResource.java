package com.cwgx.ses_inventory.rest;

import com.cwgx.ses_inventory.model.ItemImage;
import com.cwgx.ses_inventory.repositories.ItemImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

public class ItemImageResource {
    @Autowired
    private ItemImageRepository itemimageRepository;

    @RequestMapping(path = "/itemimage", method = RequestMethod.GET)
    public @ResponseBody
    Iterable<ItemImage> getAllUsers() {
        // This returns a JSON or XML with the users
        return itemimageRepository.findAll();
    }

    @RequestMapping(path = "/itemimage/{ItemName}", method = RequestMethod.GET)
    public @ResponseBody ItemImage userFindByName(@PathVariable Integer itemName) {
        // This returns a JSON or XML with the users
        return itemimageRepository.itemFindById(itemName);
    }

    @PostMapping("/itemimage/post")
    ItemImage newitemimage(@RequestBody ItemImage newitemimage){
        return itemimageRepository.save(newitemimage);
    }
}
