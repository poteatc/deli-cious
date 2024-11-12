package com.pluralsight.model.enums;

import com.pluralsight.model.Priceable;

public enum DrinkType {
    TEA("Tea"),
    WATER("Water"),
    COLA("Cola");

    private final String description;

    // Constructor to initialize the description
    DrinkType(String description) {
        this.description = description;
    }

    // Getter for the description
    public String getDescription() {
        return description;
    }

}