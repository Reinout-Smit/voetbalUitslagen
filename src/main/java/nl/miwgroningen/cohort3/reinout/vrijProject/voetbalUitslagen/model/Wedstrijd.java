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

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "teamIdThuis", referencedColumnName = "teamId", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Team teamThuis;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "teamIdUit", referencedColumnName = "teamId", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Team teamUit;

    // constructors
    public Wedstrijd(int wedstrijdId, Team teamThuis, Team teamUit) {
        this.wedstrijdId = wedstrijdId;
        this.teamThuis = teamThuis;
        this.teamUit = teamUit;
    }
    public Wedstrijd(Team teamThuis, Team teamUit) {
        this.teamThuis = teamThuis;
        this.teamUit = teamUit;
    }
    public Wedstrijd() {
    }

    // getters and setters
    public int getWedstrijdId() {
        return wedstrijdId;
    }
    public void setWedstrijdId(int wedstrijdId) {
        this.wedstrijdId = wedstrijdId;
    }
    public Team getTeamThuis() {
        return teamThuis;
    }
    public void setTeamThuis(Team teamThuis) {
        this.teamThuis = teamThuis;
    }
    public Team getTeamUit() {
        return teamUit;
    }
    public void setTeamUit(Team teamUit) {
        this.teamUit = teamUit;
    }

}
