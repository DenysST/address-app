package com.example.code.addressapp.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CoordinatesRequestDto {
    private String lat;
    private String lon;
}
