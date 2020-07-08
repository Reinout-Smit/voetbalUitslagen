package nl.miwgroningen.cohort3.reinout.vrijProject.voetbalUitslagen.model;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

/**
 * @author Reinout Smit <reinoutsmit@live.nl>
 * <p>
 * Wedstrijd controller
 * <p>
 * Setup entity en model
 */

@Entity
public class Wedstrijd {

    @Id
    @GeneratedValue
    private int wedstrijdId;

    private String teamThuis;
    private String teamUit;
    private int doelpuntenTeamThuis;
    private int doelpuntenTeamUit;

    // constructors
    public Wedstrijd(int wedstrijdId, String teamThuis, String teamUit, int doelpuntenTeamThuis, int doelpuntenTeamUit) {
        this.wedstrijdId = wedstrijdId;
        this.teamThuis = teamThuis;
        this.teamUit = teamUit;
        this.doelpuntenTeamThuis = doelpuntenTeamThuis;
        this.doelpuntenTeamUit = doelpuntenTeamUit;

    }
    public Wedstrijd(String teamThuis, String teamUit, int doelpuntenTeamThuis, int doelpuntenTeamUit) {
        this.teamThuis = teamThuis;
        this.teamUit = teamUit;
        this.doelpuntenTeamThuis = doelpuntenTeamThuis;
        this.doelpuntenTeamUit = doelpuntenTeamUit;
    }
    public Wedstrijd(String teamThuis, String teamUit) {
        this.teamThuis = teamThuis;
        this.teamUit = teamUit;
    }
    public Wedstrijd() {
    }

    // Functional methods
    public String getTeamPunten(Wedstrijd wedstrijd){
        if(wedstrijd.doelpuntenTeamThuis > wedstrijd.doelpuntenTeamUit){
            return wedstrijd.teamThuis;
        }
        else if(wedstrijd.doelpuntenTeamThuis < wedstrijd.doelpuntenTeamUit){
            return wedstrijd.teamUit;
        }
        else {
            return null;
        }
    }

    // getters and setters
    public int getWedstrijdId() {
        return wedstrijdId;
    }
    public void setWedstrijdId(int wedstrijdId) {
        this.wedstrijdId = wedstrijdId;
    }
    public String getTeamThuis() {
        return teamThuis;
    }
    public void setTeamThuis(String teamThuis) {
        this.teamThuis = teamThuis;
    }
    public String getTeamUit() {
        return teamUit;
    }
    public void setTeamUit(String teamUit) {
        this.teamUit = teamUit;
    }
    public int getDoelpuntenTeamThuis() {
        return doelpuntenTeamThuis;
    }
    public void setDoelpuntenTeamThuis(int doelpuntenTeamThuis) {
        this.doelpuntenTeamThuis = doelpuntenTeamThuis;
    }
    public int getDoelpuntenTeamUit() {
        return doelpuntenTeamUit;
    }
    public void setDoelpuntenTeamUit(int doelpuntenTeamUit) {
        this.doelpuntenTeamUit = doelpuntenTeamUit;
    }

}
