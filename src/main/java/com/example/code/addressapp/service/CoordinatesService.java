package com.example.code.addressapp.service;

import com.example.code.addressapp.model.dto.AddressRequestDto;
import com.example.code.addressapp.model.dto.AddressResponseDto;

import java.util.List;

public interface CoordinatesService {
    List<AddressResponseDto> getAddressesByCoordinates();
}
