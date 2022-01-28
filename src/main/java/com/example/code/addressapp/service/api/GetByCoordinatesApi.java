package com.example.code.addressapp.service.api;

import com.example.code.addressapp.model.dto.CoordinatesDto;
import com.example.code.addressapp.model.dto.ResponseObject;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Map;
import java.util.Optional;

@Component
public class GetByCoordinatesApi {
    public static final String URL = "https://nominatim.openstreetmap.org/reverse?format=jsonv2&";

    public Optional<Object> getResult(CoordinatesDto dto) {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Map> response = restTemplate.getForEntity(requestMaker(dto), Map.class);
        return Optional.ofNullable(response.getBody().get("address"));
    }

    private String requestMaker(CoordinatesDto dto) {
        return new StringBuilder().append(URL)
                .append("lat=")
                .append(dto.getLat())
                .append("&")
                .append("lon=")
                .append(dto.getLon())
                .toString();
    }
}
