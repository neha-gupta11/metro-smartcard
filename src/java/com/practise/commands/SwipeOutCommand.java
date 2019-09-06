package com.practise.commands;

import com.practise.model.Smartcard;
import com.practise.model.Station;
import com.practise.service.FareService;
import com.practise.service.StationService;

public class SwipeOutCommand implements Command {

    private Smartcard smartcard;

    private int stationsTravelled;

    private FareService fareService = new FareService();

    public SwipeOutCommand(Smartcard smartcard,int stationsTravelled) {
        this.smartcard = smartcard;
        this.stationsTravelled = stationsTravelled;
    }


    @Override
    public void execute() {
        //int stationsTravelled=stationService.countStationsBetween(smartcard.getSwipeInStation(),this.station);
        float totalFare=fareService.getTotalFare(stationsTravelled);
        System.out.println(totalFare);
        if(smartcard.getBalance()<totalFare){
            throw new RuntimeException("Insufficient Balance, please get a topup first.");
        }
        smartcard.payFare(totalFare);

        System.out.println("Printing card balance after checkout...."+smartcard.getBalance());

    }
}
