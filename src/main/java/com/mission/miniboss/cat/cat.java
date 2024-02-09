package com.mission.miniboss.cat;

public class cat {
    private String user;
    private String type;
    private String text;

    public cat(){

    }

    public cat(String user, String type, String text){
    this.user = user;
    this.type=type;
    this.text=text;
    }
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
