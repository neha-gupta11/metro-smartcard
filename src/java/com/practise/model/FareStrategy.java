package com.practise.model;

import com.practise.enums.TypeOfDay;

public interface FareStrategy {
   /* private TypeOfDay dayType;
    private float fare;

    public TypeOfDay getDayType() {
        return dayType;
    }

    public void setDayType(TypeOfDay dayType) {
        this.dayType = dayType;
    }

    public float getFare() {
        return fare;
    }

    public void setFare(float fare) {
        this.fare = fare;
    }*/

   public double getFare();

}
