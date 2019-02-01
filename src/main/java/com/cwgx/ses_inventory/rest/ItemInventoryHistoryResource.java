package com.cwgx.ses_inventory.rest;

import com.cwgx.ses_inventory.model.ItemInventoryHistory;
import com.cwgx.ses_inventory.repositories.ItemInventoryHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RestController
public class ItemInventoryHistoryResource {

    @Autowired
    private ItemInventoryHistoryRepository itemInventoryHistoryRepository;

    @RequestMapping(path = "/itemInventoryHH", method = RequestMethod.GET)
    public @ResponseBody
    Iterable<ItemInventoryHistory> getAllItems() {
        // This returns a JSON or XML with the users
        return itemInventoryHistoryRepository.findAll();
    }
    @PostMapping("/itemInventoryH/post")
    ItemInventoryHistory newitemhh(@RequestBody ItemInventoryHistory newitemhh){
        return itemInventoryHistoryRepository.save(newitemhh);
    }
}