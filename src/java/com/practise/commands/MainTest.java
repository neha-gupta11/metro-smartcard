package com.practise.commands;

import com.practise.model.Smartcard;
import com.practise.model.Station;

public class MainTest {
    public static void main(String[] args) {
        Smartcard card = new Smartcard();
        Command command = new SwipeInCommand(card);
        Station station = new Station(command);
        station.swap();



       // Smartcard card = new Smartcard();
        Command outCommand = new SwipeOutCommand(card,4);
        Station outStation = new Station(outCommand);
        outStation.swap();




    }

}
