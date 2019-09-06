package com.practise.util;

import com.practise.enums.TypeOfDay;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class DateUtil {

    public static TypeOfDay getToDayType(){
        TypeOfDay todayDayType= TypeOfDay.WEEKDAY;
        DayOfWeek dayOfWeek=LocalDate.now().getDayOfWeek();
        switch (dayOfWeek){
            case SATURDAY:
            case SUNDAY:
                todayDayType= TypeOfDay.WEEKEND;
                break;
        }
       return todayDayType;
    }

    public LocalDate today(){
        return LocalDate.now();
    }
}
