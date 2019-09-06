package com.practise.commands;

import com.practise.model.Smartcard;

public class SwipeInCommand implements Command {
    private Smartcard smartcard;

    public SwipeInCommand(Smartcard smartcard) {
        this.smartcard = smartcard;
    }

    @Override
    public void execute(CommandContext commandContext) {

    }
}
