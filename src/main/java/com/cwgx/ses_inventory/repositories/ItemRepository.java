package com.cwgx.ses_inventory.repositories;

import com.cwgx.ses_inventory.model.Item;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<Item, Integer> {
    @Query(value = "SELECT * FROM Item WHERE name = ?1", nativeQuery = true)
    Item itemFindByName(String name);
}