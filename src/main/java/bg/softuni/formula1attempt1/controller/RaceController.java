package bg.softuni.formula1attempt1.controller;

import bg.softuni.formula1attempt1.models.dto.AddRaceBindingModel;
import bg.softuni.formula1attempt1.models.view.RaceViewModel;
import bg.softuni.formula1attempt1.services.RaceService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/races")
public class RaceController {

    @Value("${binding-result-package}")
    private String bindingResultPath;
    private final RaceService raceService;

    public RaceController(RaceService raceService) {
        this.raceService = raceService;
    }


    @GetMapping
    public ModelAndView getAll() {
        List<RaceViewModel> races = raceService.getAll();

        ModelAndView modelAndView = new ModelAndView("race");
        modelAndView.addObject("races", races);

        return modelAndView;
    }
    @GetMapping("/add")
    public ModelAndView addRace(Model model){

        model.addAttribute("addRaceBindingModel", new AddRaceBindingModel());

        return new ModelAndView("add-race");
    }
    @PostMapping("/add")
    public ModelAndView addRace(
            AddRaceBindingModel addRaceBindingModel,
            BindingResult bindingResult,
            RedirectAttributes redirectAttributes){
        ModelAndView modelAndView = new ModelAndView();

//        if (bindingResult.hasErrors()) {
//            final String attributeName = "addRouteBindingModel";
//            redirectAttributes
//                    .addFlashAttribute(attributeName, addRaceBindingModel)
//                    .addFlashAttribute(bindingResultPath + "." + attributeName, bindingResult);
//            modelAndView.setViewName("redirect:add");
//        } else {
            raceService.add(addRaceBindingModel);
            modelAndView.setViewName("redirect:/");
        return modelAndView;

    }
    @GetMapping("/race")
    public ModelAndView viewRace(){
        ModelAndView modelAndView = new ModelAndView("race");
        return modelAndView;
    }


}
