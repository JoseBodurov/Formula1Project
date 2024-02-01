package bg.softuni.formula1attempt1.services;

import bg.softuni.formula1attempt1.models.dto.AddRaceBindingModel;
import bg.softuni.formula1attempt1.models.view.RaceViewModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RaceService {
    void add(AddRaceBindingModel addRaceBindingModel);

    List<RaceViewModel> getAll();
}
