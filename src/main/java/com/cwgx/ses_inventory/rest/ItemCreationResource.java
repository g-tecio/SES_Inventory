package com.cwgx.ses_inventory.rest;
import com.cwgx.ses_inventory.model.ItemCreation;
import com.cwgx.ses_inventory.repositories.CategoryRepository;
import com.cwgx.ses_inventory.repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
public class ItemCreationResource {
    @Autowired
    private ItemRepository itemRepository;
    @Autowired
    private CategoryRepository categoryRepository;

    @PostMapping("/itemfull/post")
    ItemCreation itemFull(@RequestBody ItemCreation itemFull){

        itemRepository.save(itemFull.getItem());
        categoryRepository.save(itemFull.getCategory());

        return itemFull;
    }
}
