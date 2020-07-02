package nl.miwgroningen.cohort3.reinout.vrijProject.voetbalUitslagen.model;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

/**
 * @author Reinout Smit <reinoutsmit@live.nl>
 * <p>
 * Dit programma is een uitwerking van opdracht
 * <p>
 * <Beschrijf wat dit programma doet>
 */

@Entity
@Table(name = "uitslag", catalog = "voetbaluitslagen")
public class Uitslag {

    @Id
    @GeneratedValue
    private int uitslagId;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "wedstrijdId", referencedColumnName = "wedstrijdId", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Wedstrijd wedstrijd;

    @Column
    private int doelpuntenTeamThuis;
    private int doelpuntenTeamUit;

    // constructors
    public Uitslag(int uitslagId, Wedstrijd wedstrijd, int doelpuntenTeamThuis, int doelpuntenTeamUit) {
        this.uitslagId = uitslagId;
        this.wedstrijd = wedstrijd;
        this.doelpuntenTeamThuis = doelpuntenTeamThuis;
        this.doelpuntenTeamUit = doelpuntenTeamUit;
    }
    public Uitslag(Wedstrijd wedstrijd, int doelpuntenTeamThuis, int doelpuntenTeamUit) {
        this.wedstrijd = wedstrijd;
        this.doelpuntenTeamThuis = doelpuntenTeamThuis;
        this.doelpuntenTeamUit = doelpuntenTeamUit;
    }
    public Uitslag() {
    }

    // getters and setters
    public int getUitslagId() {
        return uitslagId;
    }
    public void setUitslagId(int uitslagId) {
        this.uitslagId = uitslagId;
    }
    public Wedstrijd getWedstrijd() {
        return wedstrijd;
    }
    public void setWedstrijd(Wedstrijd wedstrijd) {
        this.wedstrijd = wedstrijd;
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
