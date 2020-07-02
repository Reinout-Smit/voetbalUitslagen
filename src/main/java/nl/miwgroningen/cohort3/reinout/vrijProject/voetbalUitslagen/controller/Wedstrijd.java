package nl.miwgroningen.cohort3.reinout.vrijProject.voetbalUitslagen.controller;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Reinout Smit <reinoutsmit@live.nl>
 * <p>
 * Dit programma is een uitwerking van opdracht
 * <p>
 * <Beschrijf wat dit programma doet>
 */

@Entity
public class Wedstrijd {

    @Id
    @GeneratedValue
    private int wedstrijdId;

    @Column
    private Team team1;
    private Team team2;
    private int doelpuntenTeam1;
    private int doelpuntenTeam2;

    public Wedstrijd(int wedstrijdId, Team team1, Team team2, int doelpuntenTeam1, int doelpuntenTeam2) {
        this.wedstrijdId = wedstrijdId;
        this.team1 = team1;
        this.team2 = team2;
        this.doelpuntenTeam1 = doelpuntenTeam1;
        this.doelpuntenTeam2 = doelpuntenTeam2;
    }

    public Wedstrijd(Team team1, Team team2, int doelpuntenTeam1, int doelpuntenTeam2) {
        this.team1 = team1;
        this.team2 = team2;
        this.doelpuntenTeam1 = doelpuntenTeam1;
        this.doelpuntenTeam2 = doelpuntenTeam2;
    }

    public Wedstrijd() {
    }

    public int getWedstrijdId() {
        return wedstrijdId;
    }

    public void setWedstrijdId(int wedstrijdId) {
        this.wedstrijdId = wedstrijdId;
    }

    public Team getTeam1() {
        return team1;
    }

    public void setTeam1(Team team1) {
        this.team1 = team1;
    }

    public Team getTeam2() {
        return team2;
    }

    public void setTeam2(Team team2) {
        this.team2 = team2;
    }

    public int getDoelpuntenTeam1() {
        return doelpuntenTeam1;
    }

    public void setDoelpuntenTeam1(int doelpuntenTeam1) {
        this.doelpuntenTeam1 = doelpuntenTeam1;
    }

    public int getDoelpuntenTeam2() {
        return doelpuntenTeam2;
    }

    public void setDoelpuntenTeam2(int doelpuntenTeam2) {
        this.doelpuntenTeam2 = doelpuntenTeam2;
    }
}
