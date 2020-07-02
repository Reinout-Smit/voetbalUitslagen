package nl.miwgroningen.cohort3.reinout.vrijProject.voetbalUitslagen.controller;

import nl.miwgroningen.cohort3.reinout.vrijProject.voetbalUitslagen.model.VoetbalUitslagenUser;
import nl.miwgroningen.cohort3.reinout.vrijProject.voetbalUitslagen.repository.VoetbalUitslagenUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author Reinout Smit <reinoutsmit@live.nl>
 * <p>
 * Dit programma is een uitwerking van opdracht
 * <p>
 * <Beschrijf wat dit programma doet>
 */

@Controller
public class VoetbalUitslagenUserController {

    @Autowired
    PasswordEncoder passwordEncoder;

    @Autowired
    VoetbalUitslagenUserRepository voetbalUitslagenUserRepository;

    @GetMapping("/user/new")
    @Secured("ROLE_ADMIN")
    protected String showNewUserForm(Model model){
        model.addAttribute("user", new VoetbalUitslagenUser());
        return "userForm";
    }

    @PostMapping("/user/new")
    @Secured("ROLE_ADMIN")
    protected String saveOrUpdateUser(@ModelAttribute("user") VoetbalUitslagenUser user, BindingResult result){
        if(result.hasErrors()){
            return "userForm";
        } else {
            user.setPassword(passwordEncoder.encode(user.getPassword()));
            voetbalUitslagenUserRepository.save(user);
            return "redirect:/";
        }
    }
}
