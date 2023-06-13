package com.backendengineer.springfordemo.Controller;

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

@RestController
@RequestMapping("/consume")
@Slf4j
public class ApiController {
    RestTemplate restTemplate = new RestTemplate();

    @Value("${apikey}")
    private String apikey;

    @GetMapping
    public ResponseEntity<List<Object>> getweather(@RequestParam(name = "towns", required = true) String towns) {
        String url = apikey + towns + "&aqi=no";
        Object[] objects = new Object[]{restTemplate.getForObject(url, Object.class)};
        log.info("getting weather of town : {}", towns);
        return ResponseEntity.ok(Arrays.asList(objects));
    }
}
