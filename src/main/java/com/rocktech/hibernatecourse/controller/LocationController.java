package com.rocktech.hibernatecourse.controller;

import com.rocktech.hibernatecourse.model.Location;
import com.rocktech.hibernatecourse.model.User;
import com.rocktech.hibernatecourse.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class LocationController {
    @Autowired
    private LocationService locationService;

    @GetMapping("locations")
    public List<Location> getLocations(){
        return locationService.getLocations();
    }

    @GetMapping("location/{id}")
    public Optional<Location> getLocationById(@PathVariable Integer id){
        return locationService.getLocationById(id);
    }

    @GetMapping("location/{id}/user")
    public List<User> getUsersByLocation(@PathVariable Integer id){
        Optional<Location> location = locationService.getLocationById(id);
        return location.map(Location::getUsers).orElse(null);
    }

    @PostMapping("/location/add-new")
    public void addLocation(@RequestBody Location location){
        locationService.addLocation(location);
    }

    @PutMapping("/locations/{id}/update")
    public void updateLocation(@RequestBody Location location){
        locationService.updateLocation(location);
    }

    @DeleteMapping("locations/{id}/delete")
    public void deleteLocation(@PathVariable Integer id){
        locationService.deleteLocation(id);
    }
}
