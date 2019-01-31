package com.cwgx.ses_inventory.rest;

import com.cwgx.ses_inventory.model.Treatment;
import com.cwgx.ses_inventory.repositories.TreatmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TreatmentResource {
    @Autowired
    private TreatmentRepository treatmentRepository;

    @RequestMapping(path = "/treatment", method = RequestMethod.GET)
    public @ResponseBody Iterable<Treatment> getAllUsers() {
        // This returns a JSON or XML with the users
        return treatmentRepository.findAll();
    }

    @RequestMapping(path = "/treatment/{treatmentId}", method = RequestMethod.GET)
    public @ResponseBody Treatment userFindByName(@PathVariable Integer treatmentId) {
        // This returns a JSON or XML with the users
        return treatmentRepository.treatmentFindById(treatmentId);
    }

    @PostMapping("/treatment/post")
    Treatment newtreatment(@RequestBody Treatment newtreatment){
        return treatmentRepository.save(newtreatment);
    }
}
