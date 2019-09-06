package com.practise.Strategy;

import com.practise.enums.TypeOfDay;
import com.practise.util.DateUtil;

public class WeeklyFareStrategy implements FareStrategy {

    @Override
    public float getFare() {
        float farePerStation;
        if(DateUtil.getToDayType().equals(TypeOfDay.WEEKDAY))
            farePerStation=7f;
        else
            farePerStation=5.5f;
        return farePerStation;
    }
}
