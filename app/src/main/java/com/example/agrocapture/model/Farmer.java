package com.example.agrocapture.model;

public class Farmer {

    private String Farmer_name;
    private String email;
    private String Date_of_birth;
    private String State_of_origin;
    private int Thumbnail;

    public Farmer() {
    }

    public Farmer(String farmer_name, String email, String date_of_birth, String state_of_origin, int thumbnail) {
        Farmer_name = farmer_name;
        this.email = email;
        Date_of_birth = date_of_birth;
        State_of_origin = state_of_origin;
        Thumbnail = thumbnail;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFarmer_name() {
        return Farmer_name;
    }

    public void setFarmer_name(String farmer_name) {
        Farmer_name = farmer_name;
    }

    public String getDate_of_birth() {
        return Date_of_birth;
    }

    public void setDate_of_birth(String date_of_birth) {
        Date_of_birth = date_of_birth;
    }

    public String getState_of_origin() {
        return State_of_origin;
    }

    public void setState_of_origin(String state_of_origin) {
        State_of_origin = state_of_origin;
    }

    public int getThumbnail() {
        return Thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        Thumbnail = thumbnail;
    }
}
