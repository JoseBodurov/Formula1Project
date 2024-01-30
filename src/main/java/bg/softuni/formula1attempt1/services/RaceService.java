package bg.softuni.formula1attempt1.services;

import bg.softuni.formula1attempt1.models.dto.AddRaceBindingModel;
import org.springframework.stereotype.Service;

@Service
public interface RaceService {
    void add(AddRaceBindingModel addRaceBindingModel);
}
