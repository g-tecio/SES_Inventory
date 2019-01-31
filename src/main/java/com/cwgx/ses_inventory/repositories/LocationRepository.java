package com.cwgx.ses_inventory.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.cwgx.ses_inventory.model.Location;

public interface LocationRepository extends CrudRepository<Location, Integer> {
    @Query(value = "SELECT * FROM location WHERE id_location = ?1", nativeQuery = true)
    Location locationFindById(Integer id);
}