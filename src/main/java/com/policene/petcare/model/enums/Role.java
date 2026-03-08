package com.policene.petcare.model.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Role {

    ADMIN("Admin"),
    VETERINARIAN("Veterianian"),
    TUTOR("Tutor");

    private final String description;

}
