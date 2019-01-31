package com.cwgx.ses_inventory.repositories;
import com.cwgx.ses_inventory.model.Category;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
public interface CategoryRepository extends CrudRepository<Category, Integer> {
        @Query(value = "SELECT * FROM category WHERE id_category = ?1", nativeQuery = true)
        Category categoryFindById(Integer id);
}
