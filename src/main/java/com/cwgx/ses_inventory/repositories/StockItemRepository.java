package com.cwgx.ses_inventory.repositories;
import com.cwgx.ses_inventory.model.StockItem;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
public interface StockItemRepository extends CrudRepository<StockItem, Integer> {
    @Query(value = "SELECT * FROM stock_item WHERE stock_item_id = ?1", nativeQuery = true)
    StockItem itemstockFindById(Integer id);
}
