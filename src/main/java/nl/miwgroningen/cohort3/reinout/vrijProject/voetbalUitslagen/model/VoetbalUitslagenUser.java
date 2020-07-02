package nl.miwgroningen.cohort3.reinout.vrijProject.voetbalUitslagen.model;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author Reinout Smit <reinoutsmit@live.nl>
 * <p>
 * Dit programma is een uitwerking van opdracht
 * <p>
 * <Beschrijf wat dit programma doet>
 */

@Entity
public class VoetbalUitslagenUser implements UserDetails {

    // Id geeft aan maak dit een PrimaryKey in de DB
    @Id
    // GeneratedValue zorgt ervoor dat er automatisch een volgend Id nummer wordt aangemaakt in de DB
    // Type Auto is default
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer userId;

    // set username column naar een unieke waarde
    @Column(unique = true)
    private String username;

    private String password;

    public Integer getUserId() {
        return userId;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Geeft de user een Role_User authority
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority("ROLE_USER"));
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
