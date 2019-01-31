package com.cwgx.ses_inventory.repositories;


import com.cwgx.ses_inventory.model.ItemInventory;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ItemInventoryRepository extends CrudRepository<ItemInventory, Integer> {

    @Query(value = "SELECT * FROM item_inventory WHERE name = ?1", nativeQuery = true)
    ItemInventory itemFindByName(String name);

}