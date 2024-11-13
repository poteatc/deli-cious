package com.pluralsight.model;

import com.pluralsight.model.enums.MeatType;
import com.pluralsight.model.enums.SandwichSize;

public class Meat extends Topping {
    private MeatType meatType;

    public Meat(SandwichSize sandwichSize, MeatType meatType, boolean hasExtra) {
        super(sandwichSize, Topping.ToppingType.MEAT, hasExtra);
        this.meatType = meatType;
    }

    @Override
    public String toString() {
        String s = getSandwichSize().getDescription() + " " + meatType.getDescription()
                + " " + getToppingType().getDescription();
        s += withExtra() ? " with extra" : "";
        return String.format("%s costs: $%.2f", s, getPrice());
    }
}
