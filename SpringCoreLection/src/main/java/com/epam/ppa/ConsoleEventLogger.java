package com.epam.ppa;

public class ConsoleEventLogger implements EventLogger{
    private String msg;

    public void logEvent(String msg){
        this.msg = msg;
        System.out.println(msg);
    }
}