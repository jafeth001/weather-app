package com.backendengineer.springfordemo.module;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Current {
    @JsonProperty("temp_c")
    private double temp_in_celsious;
    @JsonProperty("temp_f")
    private double temp_in_fahrenheit;
    private Condition condition;
}