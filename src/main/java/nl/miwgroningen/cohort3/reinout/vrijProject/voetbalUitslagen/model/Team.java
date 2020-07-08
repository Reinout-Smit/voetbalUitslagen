package nl.miwgroningen.cohort3.reinout.vrijProject.voetbalUitslagen.model;

import javax.persistence.*;

/**
 * @author Reinout Smit <reinoutsmit@live.nl>
 * <p>
 * Team model
 * <p>
 * Sets up entity Team to database and created the Model team.
 */

@Entity
public class Team {

    @Id
    @GeneratedValue
    private int teamId;

    @Column
    private String teamNaam;
    private int aantalPunten;

    // Constructors
    public Team(int teamId, String teamNaam, int aantalPunten) {
        this.teamId = teamId;
        this.teamNaam = teamNaam;
        this.aantalPunten = aantalPunten;
    }
    public Team(String teamNaam) {
        this.teamNaam = teamNaam;
    }
    public Team(int aantalPunten) {
        this.aantalPunten = aantalPunten;
    }
    public Team() {
    }

    // getters and setters
    public int getTeamId() {
        return teamId;
    }
    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }
    public String getTeamNaam() {
        return teamNaam;
    }
    public void setTeamNaam(String teamNaam) {
        this.teamNaam = teamNaam;
    }
    public int getAantalPunten() {
        return aantalPunten;
    }
    public void setAantalPunten(int aantalPunten) {
        this.aantalPunten = aantalPunten;
    }
}
