package com.example.code.addressapp.service.impl;

import com.example.code.addressapp.exception.AddressException;
import com.example.code.addressapp.model.dto.AddressRequestDto;
import com.example.code.addressapp.model.dto.AddressResponseDto;
import com.example.code.addressapp.model.dto.ResponseObject;
import com.example.code.addressapp.model.mapper.CoordinatesMapper;
import com.example.code.addressapp.repository.CoordinatesRepository;
import com.example.code.addressapp.service.AddressService;
import com.example.code.addressapp.service.api.GetByAddressApi;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@AllArgsConstructor
public class AddressServiceImpl implements AddressService {
    private final GetByAddressApi addressApi;
    private final CoordinatesRepository repository;

    @Override
    public Map<String, Object> getByAddress(AddressRequestDto dto) {
        Map<String, Object> response = addressApi.getByAddress(dto).orElseThrow(() ->
                new AddressException("Something wrong with Nominatim Api"));
//        repository.save(CoordinatesMapper.toEntity(response));
        return response;
    }
}
