package com.cwgx.ses_inventory.rest;

import com.cwgx.ses_inventory.model.Venue;
import com.cwgx.ses_inventory.repositories.VenueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class VenueResource {
    @Autowired
    private VenueRepository venueRepository;

    @RequestMapping(path = "/venue", method = RequestMethod.GET)
    public @ResponseBody Iterable<Venue> getAllUsers() {
        // This returns a JSON or XML with the users
        return venueRepository.findAll();
    }

    @RequestMapping(path = "/venue/{venueId}", method = RequestMethod.GET)
    public @ResponseBody Venue userFindByName(@PathVariable Integer venueId) {
        // This returns a JSON or XML with the users
        return venueRepository.venueFindById(venueId);
    }

    @PostMapping("/venue/post")
    Venue newVenue(@RequestBody Venue newVenue){
        return venueRepository.save(newVenue);
    }
}
