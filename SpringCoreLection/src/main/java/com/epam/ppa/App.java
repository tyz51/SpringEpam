package com.epam.ppa;

public class App {
    private Client client;
    private ConsoleEventLogger eventLogger;

    public static void main (String [] args){
        App app=new App();
        app.client=new Client();
        app.client.setId("1");
        app.client.setFullname("Tester");
        app.eventLogger=new ConsoleEventLogger();
        app.logEvent("some event for user 1");
    }
    private void logEvent (String msg){
       String message= msg.replaceAll(client.getId(), client.getFullname());
        eventLogger.logEvent(message);
    }
}
