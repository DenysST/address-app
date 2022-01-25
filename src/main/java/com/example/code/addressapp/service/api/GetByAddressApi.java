package com.example.code.addressapp.service.api;

import com.example.code.addressapp.model.dto.AddressRequestDto;
import com.example.code.addressapp.model.dto.AddressResponseDto;
import com.example.code.addressapp.model.dto.ResponseObject;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Component
public class GetByAddressApi {
    private static final String URL = "https://nominatim.openstreetmap.org/search/";
    private static final String RequestParams = "?format=json&addressdetails=1&limit=1&polygon_svg=1";
    public Optional<Map<String, Object>> getByAddress(AddressRequestDto dto) {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<List> response = restTemplate.getForEntity(requestMaker(dto), List.class);
        Map<String, Object> responseMap = (Map<String, Object>) response.getBody().get(0);
        return Optional.ofNullable((responseMap));
    }

    private String requestMaker (AddressRequestDto dto) {
        StringBuilder builder = new StringBuilder();
        builder.append(URL)
                .append(dto.getCity())
                .append("%20")
                .append(dto.getStreet())
                .append("%20")
                .append(dto.getBuildNumber())
                .append(RequestParams);

        return builder.toString();
    }
}
