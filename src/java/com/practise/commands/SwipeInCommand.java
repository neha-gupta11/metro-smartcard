package com.practise.commands;

import com.practise.model.Smartcard;

public class SwipeInCommand implements Command {

    private Smartcard smartcard;

    public SwipeInCommand(Smartcard smartcard) {
        this.smartcard = smartcard;
    }

    @Override
    public void execute() {
        System.out.println("Printing card balance ...."+smartcard.getBalance());
        if(smartcard.isLowBal()){
            throw new RuntimeException("Low Balance, please topup");
        }
    }




}
