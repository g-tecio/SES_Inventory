package com.cwgx.ses_inventory.repositories;

import com.cwgx.ses_inventory.model.StockItem;
import org.springframework.data.repository.CrudRepository;

public interface StockItemRepository extends CrudRepository<StockItem, Integer> {


}
