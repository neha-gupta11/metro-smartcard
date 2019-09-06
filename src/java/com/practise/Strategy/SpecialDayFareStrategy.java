package com.practise.Strategy;

import com.practise.model.SpecialDay;
import com.practise.service.SpecialDayService;

import java.util.Objects;

public class SpecialDayFareStrategy implements FareStrategy {

     private SpecialDayService specialDayService = new SpecialDayService();
    @Override
    public float getFare() {
        float farePerStation=0;
        SpecialDay specialDay=specialDayService.getTodaysDetail();
        if(Objects.nonNull(specialDay)){
            farePerStation=specialDay.getFare();
        }
        return farePerStation;
    }
}
