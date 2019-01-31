package com.cwgx.ses_inventory.rest;

import com.cwgx.ses_inventory.model.Location;
import com.cwgx.ses_inventory.repositories.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class LocationResource {
    @Autowired
    private LocationRepository locationRepository;

    @RequestMapping(path = "/location", method = RequestMethod.GET)
    public @ResponseBody Iterable<Location> getAllUsers() {
        // This returns a JSON or XML with the users
        return locationRepository.findAll();
    }

    @RequestMapping(path = "/location/{locationId}", method = RequestMethod.GET)
    public @ResponseBody Location userFindByName(@PathVariable Integer locationId) {
        // This returns a JSON or XML with the users
        return locationRepository.locationFindById(locationId);
    }

    @PostMapping("/location/post")
    Location newLocation(@RequestBody Location newLocation){
        return locationRepository.save(newLocation);
    }
}
