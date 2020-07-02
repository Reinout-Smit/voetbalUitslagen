package nl.miwgroningen.cohort3.reinout.vrijProject.voetbalUitslagen.service;

import nl.miwgroningen.cohort3.reinout.vrijProject.voetbalUitslagen.repository.VoetbalUitslagenUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @author Reinout Smit <reinoutsmit@live.nl>
 * <p>
 * Dit programma is een uitwerking van opdracht
 * <p>
 * <Beschrijf wat dit programma doet>
 */

@Service
public class VoetbalUitslagenUserDetailsService implements UserDetailsService {

    @Autowired
    VoetbalUitslagenUserRepository voetbalUitslagenUserRepository;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return voetbalUitslagenUserRepository.findByUsername(s).orElseThrow(
                () -> new UsernameNotFoundException("User " + s + " was not found"));
    }
}
