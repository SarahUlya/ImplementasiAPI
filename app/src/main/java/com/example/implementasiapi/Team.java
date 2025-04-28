package com.example.implementasiapi;

public class Team {
    private String idTeam;
    private String strTeam;
    private String strLogo;

    // Getter and Setter
    public String getIdTeam() {
        return idTeam;
    }

    public void setIdTeam(String idTeam) {
        this.idTeam = idTeam;
    }

    public String getStrTeam() {
        return strTeam;
    }

    public void setStrTeam(String strTeam) {
        this.strTeam = strTeam;
    }

    public String getStrTeamBadge() {
        return strLogo;
    }

    public void setStrTeamBadge(String strTeamBadge) {
        this.strLogo = strTeamBadge;
    }
}
