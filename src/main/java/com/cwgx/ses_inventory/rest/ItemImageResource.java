package com.cwgx.ses_inventory.rest;

import com.cwgx.ses_inventory.model.ItemImage;
import com.cwgx.ses_inventory.repositories.ItemImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RestController
public class ItemImageResource {
    @Autowired
    private ItemImageRepository itemimageRepository;

    @RequestMapping(path = "/itemimage", method = RequestMethod.GET)
    public @ResponseBody
    Iterable<ItemImage> getAllUsers() {
        // This returns a JSON or XML with the users
        return itemimageRepository.findAll();
    }

    @RequestMapping(path = "/itemimage/{itemid}", method = RequestMethod.GET)
    public @ResponseBody ItemImage itemFindByName(@PathVariable Integer itemid) {
        // This returns a JSON or XML with the users
        return itemimageRepository.itemFindById(itemid);
    }

    @PostMapping("/itemimage/post")
    ItemImage newItemImage(@RequestBody ItemImage newItemImage){
        return itemimageRepository.save(newItemImage);
    }
}
