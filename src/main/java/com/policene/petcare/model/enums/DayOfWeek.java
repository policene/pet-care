package com.policene.petcare.model.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

@Getter
@AllArgsConstructor
public enum DayOfWeek {

    SUNDAY("Sunday", 0),
    MONDAY("Monday", 1),
    TUESDAY("Tuesday", 2),
    WEDNESDAY("Wednesday", 3),
    THURSDAY("Thursday", 4),
    FRIDAY("Friday", 5),
    SATURDAY("Saturday", 6);

    private final String description;
    private final int dayNumber;

    public static DayOfWeek fromDayNumber (int number) {
        return Arrays
                .stream(DayOfWeek.values())
                .filter(day -> day.getDayNumber() == number)
                .findFirst()
                .orElse(null);
    }


}
