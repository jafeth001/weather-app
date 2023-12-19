package com.backendengineer.springfordemo.module;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Condition {
    @JsonProperty("text")
    private String weatherCondition;
}
