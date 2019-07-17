package com.example.alc_4_phase1;

public class User{

    private String track;
    private String names;
    private String country;
    private String email;
    private String phoneNumber;
    private String slackUsername;

    public User() {
    }

    public User(String track,String names, String country, String email, String phoneNumber, String slackUsername) {

        this.track = track;
        this.names = names;
        this.country = country;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.slackUsername = slackUsername;
    }

    public String getTrack() {
        return track;
    }

    public void setTrack(String track) {
        this.track = track;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSlackUsername() {
        return slackUsername;
    }

    public void setSlackUsername(String slackUsername) {
        this.slackUsername = slackUsername;
    }
}
