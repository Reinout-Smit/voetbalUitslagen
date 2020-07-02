package nl.miwgroningen.cohort3.reinout.vrijProject.voetbalUitslagen.controller;

import nl.miwgroningen.cohort3.reinout.vrijProject.voetbalUitslagen.model.Team;
import nl.miwgroningen.cohort3.reinout.vrijProject.voetbalUitslagen.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

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
    protected String showAllTeams(Model model){
        // allTeams kan gebruikt worden in een thymeleaf statement in HTML. Als allTeams wordt aangeroepen voer dan
        // wat achter de komma staat uit.
        model.addAttribute("allTeams", teamRepository.findAll());
        model.addAttribute("team", new Team());
        return "teamOverview";
    }

    /* Postmapping zorgt ervoor dat we data krijgen van de gebruiker. Deze data moeten we kunnen
       verwerken. Daarom moet er een modelAttr. worden aangemaakt. Daarnaast een BindingResult om te
       controleren of er geen foutmeldingen zijn tijdens het verkrijgen van de data van de gebruiker.
     */
    @PostMapping("/team/new")
    protected String saveOrUpdateTeam(@ModelAttribute("team") Team team, BindingResult bindingResult) {
        // ALS er errors zijn ga dan terug naar het teamOverview.
        if (bindingResult.hasErrors()) {
            return "teamOverview";
            // ANDERS sla de gegevens van de gebruiker op in een Team model en stuur naar de db
        } else {
            teamRepository.save(team);
            return "redirect:/teams";
        }
    }
}
