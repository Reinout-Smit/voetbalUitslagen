package nl.miwgroningen.cohort3.reinout.vrijProject.voetbalUitslagen.repository;

import nl.miwgroningen.cohort3.reinout.vrijProject.voetbalUitslagen.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, Integer> {

}
