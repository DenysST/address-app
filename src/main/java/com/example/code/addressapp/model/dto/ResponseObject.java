package com.example.code.addressapp.model.dto;

import lombok.Data;

@Data
public class ResponseObject {
    private String lat;
    private String lon;
    private AddressResponseDto address;
}
