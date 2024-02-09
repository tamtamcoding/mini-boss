package com.mission.miniboss.activities;

public class Activities {
    private int key;
    private String activity;
    private int participants;

    public int getParticipants() {
        return participants;
    }

    public void setParticipants(int participants) {
        this.participants = participants;
    }

    public Activities () {
        super();
    }
    public Activities(int key,String activity, int participants) {
        this.key=key;
        this.activity=activity;
        this.participants=participants;
    }

    public Integer getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }




}
