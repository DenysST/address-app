package com.example.code.addressapp.model.mapper;

import com.example.code.addressapp.model.Coordinates;
import com.example.code.addressapp.model.dto.CoordinatesDto;

import java.util.Map;

public class CoordinatesMapper {
    public static Coordinates toEntity(Map<String, Object> responseMap) {
        Coordinates coordinates = new Coordinates();
        coordinates.setLat((String) responseMap.get("lat"));
        coordinates.setLon((String) responseMap.get("lon"));
        return coordinates;
    }
    public static CoordinatesDto toDto(Coordinates coordinates) {
        return new CoordinatesDto(coordinates.getLat(), coordinates.getLon());
    }
}
