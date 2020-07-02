package nl.miwgroningen.cohort3.reinout.vrijProject.voetbalUitslagen.repository;

import nl.miwgroningen.cohort3.reinout.vrijProject.voetbalUitslagen.model.Uitslag;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UitslagRepository extends JpaRepository<Uitslag, Integer> {}
