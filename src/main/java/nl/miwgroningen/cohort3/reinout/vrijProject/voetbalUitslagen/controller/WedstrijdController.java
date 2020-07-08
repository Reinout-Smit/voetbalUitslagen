package nl.miwgroningen.cohort3.reinout.vrijProject.voetbalUitslagen.controller;

import nl.miwgroningen.cohort3.reinout.vrijProject.voetbalUitslagen.model.Team;
import nl.miwgroningen.cohort3.reinout.vrijProject.voetbalUitslagen.model.Wedstrijd;
import nl.miwgroningen.cohort3.reinout.vrijProject.voetbalUitslagen.repository.TeamRepository;
import nl.miwgroningen.cohort3.reinout.vrijProject.voetbalUitslagen.repository.WedstrijdRepository;
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
 * Dit programma is een uitwerking van opdracht
 * <p>
 * <Beschrijf wat dit programma doet>
 */

@Controller
public class WedstrijdController {

    @Autowired
    WedstrijdRepository wedstrijdRepository;

    @GetMapping("/wedstrijden")
    protected String showAllWedstrijden(Model model){
        // allTeams kan gebruikt worden in een thymeleaf statement in HTML. Als allTeams wordt aangeroepen voer dan
        // wat achter de komma staat uit.
        model.addAttribute("allWedstrijden", wedstrijdRepository.findAll());
        model.addAttribute("wedstrijd", new Wedstrijd());
        return "wedstrijdForm";
    }

    /* Postmapping zorgt ervoor dat we data krijgen van de gebruiker. Deze data moeten we kunnen
       verwerken. Daarom moet er een modelAttr. worden aangemaakt. Daarnaast een BindingResult om te
       controleren of er geen foutmeldingen zijn tijdens het verkrijgen van de data van de gebruiker.
     */
    @PostMapping("/wedstrijd/new")
    protected String saveOrUpdateTeam(@ModelAttribute("wedstrijd") Wedstrijd wedstrijd, BindingResult bindingResult) {
        // ALS er errors zijn ga dan terug naar het teamOverview.
        if (bindingResult.hasErrors()) {
            bindingResult.reject("Er ging iets mis met je invoer");
            return "wedstrijdForm";
            // ANDERS sla de gegevens van de gebruiker op in een Wedstrijd model en stuur naar de db
        } else {
            wedstrijdRepository.save(wedstrijd);
            return "redirect:/wedstrijden";
        }
    }
}
