package com.example.code.addressapp.model.dto;

import com.example.code.addressapp.model.dto.model.Features;
import lombok.Data;

import java.util.List;

@Data
public class ByCoordinatesRsDto {
    private String type;
    private List<Features> features;
}
