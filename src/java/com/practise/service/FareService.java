package com.practise.service;

import com.practise.Strategy.FareStrategy;
import com.practise.Strategy.SpecialDayFareStrategy;
import com.practise.Strategy.WeeklyFareStrategy;

public class FareService {

    private SpecialDayService specialDayService = new SpecialDayService();

    public float getTotalFare(int stationCount){
        FareStrategy fareStrategy;
        if(specialDayService.isTodaySpecialDay()){
            fareStrategy=new SpecialDayFareStrategy();
        }else {
            fareStrategy=new WeeklyFareStrategy();
        }
        return calcFare(fareStrategy,stationCount);
    }

    private float calcFare(FareStrategy fareStrategy, int stationCount) {

        return stationCount * fareStrategy.getFare();
    }


}
