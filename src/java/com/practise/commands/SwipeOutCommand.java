package com.practise.commands;

import com.practise.model.Smartcard;
import com.practise.model.Station;
import com.practise.service.FareService;
import com.practise.service.StationService;

public class SwipeOutCommand implements Command {

    private Smartcard smartcard;

    private StationService stationService;
    private FareService fareService;

    public SwipeOutCommand(Smartcard smartcard) {
        this.smartcard = smartcard;
    }


    @Override
    public void execute(Station station) {
        int stationsTravelled=stationService.countStationsBetween(smartcard.getSwipeInStation(),station);
        float totalFare=fareService.getTotalFare(stationsTravelled);
        if(smartcard.getBalance()<totalFare){
            throw new RuntimeException("Insufficient Balance, please get a topup first.");
        }
        smartcard.payFare(totalFare);
        smartcard.setSwipeInStation(null);
    }
}
