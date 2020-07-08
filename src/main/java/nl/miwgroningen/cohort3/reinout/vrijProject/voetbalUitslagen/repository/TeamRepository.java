package nl.miwgroningen.cohort3.reinout.vrijProject.voetbalUitslagen.repository;

import nl.miwgroningen.cohort3.reinout.vrijProject.voetbalUitslagen.model.Team;
import org.hibernate.annotations.SQLUpdate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;


public interface TeamRepository extends JpaRepository<Team, Integer> {
    @Transactional
    @Modifying
    @Query(value = "UPDATE team SET aantal_punten = ?1 WHERE team_naam = ?2", nativeQuery = true)
    void updatePuntenByTeamNaam(int aantalPunten, String teamNaam);

    @Query(value = "SELECT aantal_punten FROM team WHERE team_naam = ?1", nativeQuery = true)
    int getPuntenByTeam(String teamNaam);
}
