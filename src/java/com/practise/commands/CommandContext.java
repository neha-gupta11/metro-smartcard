package com.practise.commands;

import java.util.HashMap;
import java.util.Map;

public class CommandContext {
    private Command command;
    private Map<String,Object> variables=new HashMap<>();

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public Map<String, Object> getVariables() {
        return variables;
    }

    public void setVariables(Map<String, Object> variables) {
        this.variables = variables;
    }

    public CommandContext(Command command) {
        this.command = command;
    }
}
