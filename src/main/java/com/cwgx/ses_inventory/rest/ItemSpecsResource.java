package com.cwgx.ses_inventory.rest;

import com.cwgx.ses_inventory.model.ItemSpecs;
import com.cwgx.ses_inventory.repositories.ItemSpecsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

public class ItemSpecsResource {
    @Autowired
    private ItemSpecsRepository itemspecsRepository;

    @RequestMapping(path = "/itemspecs", method = RequestMethod.GET)
    public @ResponseBody
    Iterable<ItemSpecs> getAllUsers() {
        // This returns a JSON or XML with the users
        return itemspecsRepository.findAll();
    }

    @RequestMapping(path = "/itemspecs/{specsitem}", method = RequestMethod.GET)
    public @ResponseBody ItemSpecs userFindByName(@PathVariable Integer stockitem) {
        // This returns a JSON or XML with the users
        return itemspecsRepository.itemspecsFindById(stockitem);
    }

    @PostMapping("/itemspecs/post")
    ItemSpecs newStockItem(@RequestBody ItemSpecs newStockItem){
        return itemspecsRepository.save(newStockItem);
    }
}
