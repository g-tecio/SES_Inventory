package com.cwgx.ses_inventory.repositories;

import com.cwgx.ses_inventory.model.Venue;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface VenueRepository extends CrudRepository<Venue, Integer> {
    @Query(value = "SELECT * FROM venue WHERE id_venue = ?1", nativeQuery = true)
    Venue venueFindById(Integer id);
}