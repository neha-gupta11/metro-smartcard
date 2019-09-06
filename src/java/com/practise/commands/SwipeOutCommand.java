package com.practise.commands;

import com.practise.model.Smartcard;

public class SwipeOutCommand implements Command {

    private Smartcard smartcard;

    public SwipeOutCommand(Smartcard smartcard) {
        this.smartcard = smartcard;
    }


    @Override
    public void execute(CommandContext commandContext) {

    }
}
