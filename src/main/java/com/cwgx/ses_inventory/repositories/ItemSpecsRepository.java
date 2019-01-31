package com.cwgx.ses_inventory.repositories;

import com.cwgx.ses_inventory.model.ItemSpecs;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ItemSpecsRepository extends CrudRepository<ItemSpecs, Integer> {
    @Query(value = "SELECT * FROM item_specs WHERE specs_id = ?1", nativeQuery = true)
    ItemSpecs itemspecsFindById(Integer id);
}
