package com.lambdaschool.injections;

public class BaseballAthleteCreationInjector {
    public String name;
    public BaseballAthleteCreationInjector(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
}
