package com.example.code.addressapp.service.api;

import com.example.code.addressapp.model.dto.AddressResponseDto;
import com.example.code.addressapp.model.dto.CoordinatesRequestDto;
import com.example.code.addressapp.model.dto.ResponseObject;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Map;
import java.util.Optional;

@Component
public class GetByCoordinatesApi {
    public static final String URL = "https://nominatim.openstreetmap.org/reverse?format=jsonv2&";

    public Optional<ResponseObject> getResult(CoordinatesRequestDto dto) {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<ResponseObject> response = restTemplate.getForEntity(requestMaker(dto), ResponseObject.class);
        return Optional.ofNullable(response.getBody());
    }

    private String requestMaker(CoordinatesRequestDto dto) {
        return new StringBuilder().append(URL)
                .append(dto.getLat())
                .append("&")
                .append(dto.getLon())
                .toString();
    }
}
