package com.backendengineer.springfordemo.module;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.time.LocalTime;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Locations {
    private String name;
    private String region;
    private String country;
    private LocalTime localTime;
}
