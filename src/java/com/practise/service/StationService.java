package com.practise.service;

import com.practise.model.Station;

import java.util.Objects;

public class StationService {

    /*public Station getCurrentStation() {
        return new Station();
    }*/

    public int countStationsBetween(Station swipeIn, Station swipeOut) {
        int count = countStations(swipeIn, swipeOut);
        if (count == 0) {
            count = countStations(swipeOut, swipeIn);
        }
        return count;
    }

    private int countStations(Station origin, Station destination) {
        int count = 0;
        Station temp = origin;
        boolean swippedOutStationFound = false;
        while (Objects.nonNull(temp.getPreviousStation())) {
            count++;
            temp = temp.getPreviousStation();
            if (temp.getId().equals(destination.getId())) {
                swippedOutStationFound = true;
                break;
            }
        }
        return swippedOutStationFound ? count : 0;
    }
}
