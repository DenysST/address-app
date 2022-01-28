package com.example.code.addressapp.service;

import com.example.code.addressapp.model.dto.AddressRequestDto;
import com.example.code.addressapp.model.dto.AddressResponseDto;
import com.example.code.addressapp.model.dto.CoordinatesDto;

import java.util.Map;

public interface AddressService {
    CoordinatesDto getByAddress(AddressRequestDto dto);
}
