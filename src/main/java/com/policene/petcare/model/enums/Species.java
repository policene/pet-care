package com.policene.petcare.model.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Species {

    DOG("Dog"),
    CAT("Cat"),
    BIRD("Bird"),
    REPTILE("Reptile"),
    OTHER("Other");

    private final String description;

}
