package com.backendengineer.springfordemo.Controller;

import com.backendengineer.springfordemo.module.Location;
import com.backendengineer.springfordemo.module.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/weather")
public class ApiController {
    RestTemplate restTemplate = new RestTemplate();
    @Value("${apikey}")
    private String apikey;
    // this is before creating a module.It was hard coding the place
//
//    @GetMapping
//    public List<Object> getWeather(@RequestParam(name = "towns", required = true) String towns) {
//        String url = apikey + towns + "&aqi=no";
//        Object[] objects = new Object[]{restTemplate.getForObject(url, Object.class)};
//        log.info("getting weather of town : {}", towns);
//        return Arrays.asList(objects);
//    }


    //after creating the module

    @GetMapping("/get")
    public ResponseEntity<Response> response(@RequestParam(name = "towns", required = true) String towns) {
        String url = apikey + towns + "&aqi=no";
        ResponseEntity<Response> locations = restTemplate.getForEntity(url, Response.class);
        log.info("getting weather of town : {}", towns);
        return ResponseEntity.ok(locations.getBody());
    }

}
