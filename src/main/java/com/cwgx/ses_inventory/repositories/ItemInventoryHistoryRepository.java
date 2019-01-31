package com.cwgx.ses_inventory.repositories;


import com.cwgx.ses_inventory.model.ItemInventoryHistory;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ItemInventoryHistoryRepository extends CrudRepository<ItemInventoryHistory, Integer> {

    @Query(value = "SELECT * FROM item_inventory_history WHERE name = ?1", nativeQuery = true)
    ItemInventoryHistory itemFindByName(String name);

}
