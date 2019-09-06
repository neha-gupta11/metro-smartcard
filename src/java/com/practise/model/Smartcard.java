package com.practise.model;

public class Smartcard {
    private float minBal;
    private float balance;
    private boolean inJourney=false;
    private Station swipeInStation;

    public float getMinBal() {
        return minBal;
    }

    public void setMinBal(float minBal) {
        this.minBal = minBal;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public boolean isInJourney() {
        return inJourney;
    }

    public void setInJourney(boolean inJourney) {
        this.inJourney = inJourney;
    }

    public Station getSwipeInStation() {
        return swipeInStation;
    }

    public void setSwipeInStation(Station swipeInStation) {
        this.swipeInStation = swipeInStation;
    }

    public Smartcard(float minBal, float balance) {
        this.minBal = minBal;
        this.balance = balance;
    }

    public void swipeIn(){

    }
}
