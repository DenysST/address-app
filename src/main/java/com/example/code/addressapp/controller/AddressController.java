package com.example.code.addressapp.controller;

import com.example.code.addressapp.model.dto.AddressRequestDto;
import com.example.code.addressapp.model.dto.AddressResponseDto;
import com.example.code.addressapp.service.AddressService;
import com.example.code.addressapp.service.CoordinatesService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@AllArgsConstructor
@RestController
@RequestMapping("/address")
public class AddressController {
    private final CoordinatesService coordinatesService;
    private final AddressService addressService;

    @GetMapping("/byCoordinates")
    public List<AddressResponseDto> byCoordinates() {
        return coordinatesService.getAddressesByCoordinates();
    }

    @PostMapping("/byAddress")
    public Map<String, Object> getByAddress(@RequestBody AddressRequestDto dto) {
        return addressService.getByAddress(dto);
    }
}
