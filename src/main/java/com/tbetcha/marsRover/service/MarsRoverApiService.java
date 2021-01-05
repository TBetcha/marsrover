package com.tbetcha.marsRover.service;

import com.tbetcha.marsRover.response.MarsRoverApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MarsRoverApiService {
    public MarsRoverApiResponse getRoverData() {
        RestTemplate rt = new RestTemplate();

        ResponseEntity<MarsRoverApiResponse> response = rt.getForEntity("https://api.nasa" +
                        ".gov/mars-photos/api/v1/rovers/curiosity/photos?sol=2&api_key=VAOzZ9OnaiGqlgPJO2sqGqtoDno8sFTdgpVWhuuT",
                MarsRoverApiResponse.class);

        return response.getBody();
    }
}
