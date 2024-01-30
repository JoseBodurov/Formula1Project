package bg.softuni.formula1attempt1.controller;

import bg.softuni.formula1attempt1.models.dto.AddRaceBindingModel;
import bg.softuni.formula1attempt1.services.RaceService;
import net.sf.jsqlparser.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/races")
public class RaceController {

    private final RaceService raceService;

    public RaceController(RaceService raceService) {
        this.raceService = raceService;
    }

    @GetMapping("/add")
    public ModelAndView addRace(){
       ModelAndView modelAndView = new ModelAndView("add-race");
        return modelAndView;
    }
    @PostMapping("/add")
    public ModelAndView addRace(AddRaceBindingModel addRaceBindingModel){
        raceService.add(addRaceBindingModel);
         return new ModelAndView("redirect:/");
    }
    @GetMapping("/race")
    public ModelAndView viewRace(){
        ModelAndView modelAndView = new ModelAndView("race");
        return modelAndView;
    }

}
