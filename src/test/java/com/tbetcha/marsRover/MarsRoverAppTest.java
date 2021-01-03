package com.tbetcha.marsRover;

import com.tbetcha.marsRover.response.MarsRoverApiResponse;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class MarsRoverAppTest {

    @Test
    public void smallTest(){
        RestTemplate rt = new RestTemplate();

        ResponseEntity<MarsRoverApiResponse> response = rt.getForEntity("https://api.nasa.gov/mars-photos/api/v1/rovers" +
                "/curiosity" +
                "/photos" +
                "?earth_date" +
                "=2015-6-3" +
                "&api_key" +
                "=DEMO_KEY", MarsRoverApiResponse.class );

        System.out.println(response.getBody());
    }
}
