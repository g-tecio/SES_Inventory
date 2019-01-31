package com.cwgx.ses_inventory.repositories;

import com.cwgx.ses_inventory.model.Treatment;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface TreatmentRepository extends CrudRepository<Treatment, Integer> {
    @Query(value = "SELECT * FROM treatment WHERE id_treatment = ?1", nativeQuery = true)
    Treatment treatmentFindById(Integer id);
}
