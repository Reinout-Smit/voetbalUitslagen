package nl.miwgroningen.cohort3.reinout.vrijProject.voetbalUitslagen.repository;


import nl.miwgroningen.cohort3.reinout.vrijProject.voetbalUitslagen.model.VoetbalUitslagenUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface VoetbalUitslagenUserRepository extends JpaRepository<VoetbalUitslagenUser, Integer> {
    Optional<VoetbalUitslagenUser> findByUsername(String username);
}
