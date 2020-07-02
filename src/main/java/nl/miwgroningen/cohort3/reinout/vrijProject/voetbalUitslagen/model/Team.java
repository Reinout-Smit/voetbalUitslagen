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

    /* Een wedstrijd heeft meerdere teams en teams hebben meerdere wedsrtijden.
       Join column haalt de wedstrijdId op uit de wedstrijd tabel en gebruik de primary key als foreign key in de nieuwe tabel.
       De inverseJoincolumns haalt de pk uit de team tabel en plaatst deze in de tussentabel samen met de wedstrijdid.
       De name wedstrijdUitslag is de naam van de nieuwe tussentabel.
     */

    @ManyToMany
    @JoinTable(name = "wedstrijdUitslag",
               joinColumns = @JoinColumn(name = "wedstrijdId"),
               inverseJoinColumns = @JoinColumn(name = "teamId"))
    private Wedstrijd wedstrijd;

    // maak de teamnamen uniek
    @Column(unique = true)
    private String teamNaam;

    private int puntenTotaal;

    // Constructors
    public Team(int teamId, Wedstrijd wedstrijd, String teamNaam, int puntenTotaal) {
        this.teamId = teamId;
        this.wedstrijd = wedstrijd;
        this.teamNaam = teamNaam;
        this.puntenTotaal = puntenTotaal;
    }

    public Team(Wedstrijd wedstrijd, String teamNaam, int puntenTotaal) {
        this.wedstrijd = wedstrijd;
        this.teamNaam = teamNaam;
        this.puntenTotaal = puntenTotaal;
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

    public Wedstrijd getWedstrijd() {
        return wedstrijd;
    }

    public void setWedstrijd(Wedstrijd wedstrijd) {
        this.wedstrijd = wedstrijd;
    }

    public String getTeamNaam() {
        return teamNaam;
    }

    public void setTeamNaam(String teamNaam) {
        this.teamNaam = teamNaam;
    }

    public int getPuntenTotaal() {
        return puntenTotaal;
    }

    public void setPuntenTotaal(int puntenTotaal) {
        this.puntenTotaal = puntenTotaal;
    }
}
