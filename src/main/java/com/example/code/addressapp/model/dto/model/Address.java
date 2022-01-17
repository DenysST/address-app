package com.example.code.addressapp.model.dto.model;

import lombok.Data;

@Data
public class Address {
    private String house_number;
    private String road;
    private String suburb;
    private String city;
    private String county;
    private String state;
    private String postcode;
    private String country;
    private String country_code;
}
