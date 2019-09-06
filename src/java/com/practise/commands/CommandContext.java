package com.practise.commands;

import com.practise.model.Station;

import java.util.HashMap;
import java.util.Map;

public class CommandContext {
    private Command command;
    private Map<String,Object> variables=new HashMap<>();


    public CommandContext(Command command, Map<String, Object> variables) {
        this.command = command;
        this.variables = variables;
    }

    public void execute(){
        Station station=(Station) this.variables.get("station");
        command.execute(station);
    }
}
