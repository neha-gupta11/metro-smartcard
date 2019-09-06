package com.practise.commands;

import com.practise.model.Smartcard;
import com.practise.model.Station;

public class SwipeInCommand implements Command {
    private Smartcard smartcard;

    public SwipeInCommand(Smartcard smartcard) {
        this.smartcard = smartcard;
    }

    @Override
    public void execute(Station station) {
        if(smartcard.isLowBal()){
            throw new RuntimeException("Low Balance, please topup");
        }
        //todo how to set swipeIn Station
        smartcard.setSwipeInStation(station);
    }
}
