package com.policene.petcare.model.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum AppointmentType {

    ROUTINE("Routine"),
    URGENT("Urgent"),
    FOLLOW_UP("Follow Up"),
    VACCINATION("Vaccination"),
    SURGERY("Surgery");

    private final String description;

}
