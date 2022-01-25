package com.example.code.addressapp.model.mapper;

import com.example.code.addressapp.model.Coordinates;
import com.example.code.addressapp.model.dto.CoordinatesRequestDto;
import com.example.code.addressapp.model.dto.ResponseObject;

import java.util.Map;

public class CoordinatesMapper {
    public static Coordinates toEntity(Map<String, String> responseMap) {
        Coordinates coordinates = new Coordinates();
        coordinates.setLat(responseMap.get("lat"));
        coordinates.setLon(responseMap.get("lon"));
        return coordinates;
    }
    public static CoordinatesRequestDto toDto(Coordinates coordinates) {
        return new CoordinatesRequestDto(coordinates.getLat(), coordinates.getLon());
    }
}
