package com.techelevator.locations.services;

import com.techelevator.locations.model.Location;
import com.techelevator.util.BasicLogger;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestClientResponseException;
import org.springframework.web.client.RestTemplate;

public class LocationService {

    private static final String API_BASE_URL = "http://localhost:3000/locations/";
    private final RestTemplate restTemplate = new RestTemplate();

    public Location add(Location newLocation) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<Location> entity = new HttpEntity<>(newLocation, headers);
        Location newerLocation = null;
        try {
            newerLocation = restTemplate.postForObject(API_BASE_URL, entity, Location.class);
        } catch (RestClientResponseException ex) {
            BasicLogger.log(ex.getRawStatusCode() +  " : " + "404 File Not Found");
        } catch (ResourceAccessException ex){
            BasicLogger.log(ex.getMessage() +  " : " + "Uh-oh, Programmer is asleep. Hold out, programmer!");
        }
        return newerLocation;
    }

    public boolean update(Location updatedLocation) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<Location> entity = new HttpEntity<>(updatedLocation, headers);

        boolean success = false;
        try{
            restTemplate.put(API_BASE_URL + updatedLocation.getId(), entity);
            success = true;
        } catch (RestClientResponseException ex) {
            BasicLogger.log(ex.getRawStatusCode() +  " : " + "404 File Not Found");
        } catch (ResourceAccessException ex){
            BasicLogger.log(ex.getMessage() +  " : " + "Uh-oh, Programmer is asleep. Hold out, programmer!");
        }

        return success;
    }

    public boolean delete(int id) {
        boolean success = false;
        try{
            restTemplate.delete(API_BASE_URL + id );
            success = true;
        } catch (RestClientResponseException ex) {
            BasicLogger.log(ex.getRawStatusCode() +  " : " + "404 File Not Found");
        } catch (ResourceAccessException ex){
            BasicLogger.log(ex.getMessage() +  " : " + "Uh-oh, Programmer is asleep. Hold out, programmer!");
        }
        return success;
    }


    public Location[] getAll() {
        Location[] locations = null;
        try {
            locations = restTemplate.getForObject(API_BASE_URL, Location[].class);
        } catch (RestClientResponseException e) {
            BasicLogger.log(e.getRawStatusCode() + " : " + e.getStatusText());
        } catch (ResourceAccessException e) {
            BasicLogger.log(e.getMessage());
        }
        return locations;
    }

    public Location getOne(int id) {
        Location location = null;
        try {
            location = restTemplate.getForObject(API_BASE_URL + id, Location.class);
        } catch (RestClientResponseException e) {
            BasicLogger.log(e.getRawStatusCode() + " : " + e.getStatusText());
        } catch (ResourceAccessException e) {
            BasicLogger.log(e.getMessage());
        }
        return location;
    }

    private HttpEntity<Location> makeEntity(Location location){
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        return new HttpEntity<>(location, headers);
    }

}
