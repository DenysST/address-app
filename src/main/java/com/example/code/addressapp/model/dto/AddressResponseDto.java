package com.example.code.addressapp.model.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class AddressResponseDto {
    private Long id;
    private String country;
    private String city;
    private String road;
    private int house_number;
}
