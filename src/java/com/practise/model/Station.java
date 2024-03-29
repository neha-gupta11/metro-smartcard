package com.practise.model;

import com.practise.commands.Command;

public class Station {
    private Long id;
    private String name;
    private Station previousStation;
    private Station nextStation;
    private Command command;

    public Station(Command command){
        this.command = command;
    }

    public void swap(){
        command.execute();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Station getPreviousStation() {
        return previousStation;
    }

    public void setPreviousStation(Station previousStation) {
        this.previousStation = previousStation;
    }

    public Station getNextStation() {
        return nextStation;
    }

    public void setNextStation(Station nextStation) {
        this.nextStation = nextStation;
    }
}
