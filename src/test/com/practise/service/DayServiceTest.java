package com.practise.service;

import com.practise.commands.Command;
import com.practise.commands.SwipeInCommand;
import com.practise.enums.TypeOfDay;
import com.practise.model.Smartcard;
import com.practise.util.DateUtil;
import org.junit.Test;
import org.mockito.Mockito;

import java.time.DayOfWeek;

public class DayServiceTest {
     private DateUtil dayService =new DateUtil();

    @Test
    public void canaryTest(){
        assert true;
    }

    @Test
    public void test_getToDayType(){
        Mockito.doReturn(DayOfWeek.WEDNESDAY).when(Mockito.spy(dayService)).getDayOfTheWeek();
        TypeOfDay day=dayService.getToDayType();
        assert day.equals(TypeOfDay.WEEKDAY);

//        Command c = new SwipeInCommand(new Smartcard());
//        c.execute();

    }
}
