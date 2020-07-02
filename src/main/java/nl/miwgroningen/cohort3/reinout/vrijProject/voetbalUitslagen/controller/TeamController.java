package nl.miwgroningen.cohort3.reinout.vrijProject.voetbalUitslagen.controller;

import nl.miwgroningen.cohort3.reinout.vrijProject.voetbalUitslagen.model.Team;
import nl.miwgroningen.cohort3.reinout.vrijProject.voetbalUitslagen.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Reinout Smit <reinoutsmit@live.nl>
 * <p>
 * TeamController
 * <p>
 * <Beschrijf wat dit programma doet>
 */

@Controller
public class TeamController {

    @Autowired
    TeamRepository teamRepository;

    @GetMapping("/teams")
    public String showAllTeams(Model model){
        model.addAttribute("allTeams", teamRepository.findAll());
        model.addAttribute("team", new Team());
        return "teamOverview";
    }

}
