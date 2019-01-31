package com.cwgx.ses_inventory.rest;

import com.cwgx.ses_inventory.model.StockItem;
import com.cwgx.ses_inventory.repositories.StockItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StockItemResource {
    @Autowired
    private StockItemRepository stockitemRepository;

    @RequestMapping(path = "/stock", method = RequestMethod.GET)
    public @ResponseBody
    Iterable<StockItem> getAllUsers() {
        // This returns a JSON or XML with the users
        return stockitemRepository.findAll();
    }

    @RequestMapping(path = "/stock/{stockitem}", method = RequestMethod.GET)
    public @ResponseBody StockItem userFindByName(@PathVariable Integer stockitem) {
        // This returns a JSON or XML with the users
        return stockitemRepository.itemstockFindById(stockitem);
    }

    @PostMapping("/stock/post")
    StockItem newStockItem(@RequestBody StockItem newStockItem){
        return stockitemRepository.save(newStockItem);
    }
}
