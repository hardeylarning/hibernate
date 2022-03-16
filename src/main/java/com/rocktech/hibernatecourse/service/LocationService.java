package com.rocktech.hibernatecourse.service;

import com.rocktech.hibernatecourse.model.Location;
import com.rocktech.hibernatecourse.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LocationService {

    @Autowired
    private LocationRepository locationRepository;

    public List<Location> getLocations() {
        return locationRepository.findAll();
    }

    public Optional<Location> getLocationById(Integer id) {
        return locationRepository.findById(id);
    }

    public void addLocation(Location location){
        locationRepository.save(location);
    }

    public void updateLocation(Location location){
        locationRepository.save(location);
    }

    public void deleteLocation(Integer id){
        locationRepository.deleteById(id);
    }

}
