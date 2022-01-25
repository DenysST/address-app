package com.example.code.addressapp.service.impl;

import com.example.code.addressapp.exception.AddressException;
import com.example.code.addressapp.model.Coordinates;
import com.example.code.addressapp.model.dto.AddressResponseDto;
import com.example.code.addressapp.model.dto.ResponseObject;
import com.example.code.addressapp.model.mapper.CoordinatesMapper;
import com.example.code.addressapp.repository.CoordinatesRepository;
import com.example.code.addressapp.service.CoordinatesService;
import com.example.code.addressapp.service.api.GetByCoordinatesApi;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CoordinatesServiceImpl implements CoordinatesService {
    private final GetByCoordinatesApi coordinatesApi;
    private final CoordinatesRepository repository;

    @Override
    public List<AddressResponseDto> getAddressesByCoordinates() {
        List<Coordinates> coordinates = repository.findAll();
        List<AddressResponseDto> addresses = new ArrayList<>();
        for (Coordinates coordinate : coordinates) {
            Optional<ResponseObject> result =
                    coordinatesApi.getResult(CoordinatesMapper.toDto(coordinate));
            ResponseObject responseObject = result.orElseThrow(() ->
                    new AddressException("Something wrong with Nominatim Api"));
            addresses.add(responseObject.getAddress());
        }
        return addresses;
    }
}
