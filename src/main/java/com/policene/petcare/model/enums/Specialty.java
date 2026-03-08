package com.policene.petcare.model.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Specialty {

    GENERAL_PRACTICE("General Practice"),
    SURGERY("Surgery"),
    DERMATOLOGY("Dermatology"),
    CARDIOLOGY("Cardiology"),
    OPHTHALMOLOGY("Ophthalmology"),
    ORTHOPEDICS("Orthopedics"),
    ONCOLOGY("Oncology"),
    NEUROLOGY("Neurology"),
    DENTISTRY("Dentistry"),
    EXOTIC_ANIMALS("Exotic Animals"),
    NUTRITION("Nutrition"),
    BEHAVIORAL_MEDICINE("Behavioral Medicine");

    private final String description;

}
