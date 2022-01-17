package com.example.code.addressapp.controller;

import com.example.code.addressapp.model.dto.ByCoordinatesRqDto;
import com.example.code.addressapp.model.dto.ByCoordinatesRsDto;
import com.google.gson.Gson;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/address")
public class AddressController {

    @PostMapping("/byCoordinates")
    public Object byCoordinates(ByCoordinatesRqDto dto) {
        RestTemplate client = new RestTemplate();
        String url = "https://nominatim.openstreetmap.org/reverse?format=geojson&lat=44.50155&lon=11.33989";
        ResponseEntity<String> forEntity = client.getForEntity(url, String.class);
        Gson gson = new Gson();
        ByCoordinatesRsDto byCoordinatesRsDto = gson.fromJson(forEntity.getBody(), ByCoordinatesRsDto.class);
        return forEntity;
    }
}
