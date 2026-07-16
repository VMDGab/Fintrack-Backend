package com.vmdgab.Spring_App.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
public class CategoryDTO {
    private UUID id;
    private String title;
    private Boolean essential;
}
