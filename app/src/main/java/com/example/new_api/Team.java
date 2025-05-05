package com.example.new_api;

public class Team {
    String name, logoUrl;

    public Team(String name, String logoUrl){
        this.name = name;
        this.logoUrl = logoUrl;
    }

    public String getName() {
        return name; }

    public String getLogoUrl() {
        return logoUrl;
    }
}
