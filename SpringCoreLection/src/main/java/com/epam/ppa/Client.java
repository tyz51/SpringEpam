package com.epam.ppa;

public class Client {
    private String id;
    private String fullname;

    public Client(String id, String fullname){
        this.id=id;
        this.fullname=fullname;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}