package com.backendengineer.springfordemo.module;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Location {
    private String name;
    private String region;
    private String country;
    @JsonProperty("lat")
    private double latitude;
    @JsonProperty("lon")
    private double longitude;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime localTime = LocalDateTime.now();


}
