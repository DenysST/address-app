package com.example.code.addressapp.model.dto;

import lombok.Data;

@Data
public class AddressRequestDto {
    private String city;
    private String street;
    private int buildNumber;
}
