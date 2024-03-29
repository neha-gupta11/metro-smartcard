package com.practise.model;

public class Smartcard {
    private float minBal;
    private float balance=100;
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

    public Boolean isLowBal(){
        return this.getBalance()<this.getMinBal();
    }

    public void recharge(float topup){
        this.balance+=topup;
    }

    public void payFare(float fare){
        this.balance-=fare;
    }

    public Smartcard(){}
}
