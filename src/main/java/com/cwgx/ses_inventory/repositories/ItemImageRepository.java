package com.cwgx.ses_inventory.repositories;

import com.cwgx.ses_inventory.model.ItemImage;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ItemImageRepository extends CrudRepository<ItemImage, Integer> {
    @Query(value = "SELECT * FROM item_image WHERE id_item_image = ?1", nativeQuery = true)
    ItemImage itemFindById(Integer id);
}