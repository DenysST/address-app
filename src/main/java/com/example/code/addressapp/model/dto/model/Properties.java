package com.example.code.addressapp.model.dto.model;

import lombok.Data;

@Data
public class Properties {
    private Long place_id;
    private String osm_type;
    private Long osm_id;
    private Long place_rank;
    private String category;
    private String type;
    private int importance;
    private String addresstype;
    private String name;
    private String display_name;
    private Address address;
}
