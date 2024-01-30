package bg.softuni.formula1attempt1.services.impl;

import bg.softuni.formula1attempt1.models.Race;
import bg.softuni.formula1attempt1.models.User;
import bg.softuni.formula1attempt1.models.dto.AddRaceBindingModel;
import bg.softuni.formula1attempt1.repositories.RaceRepository;
import bg.softuni.formula1attempt1.repositories.UserRepository;
import bg.softuni.formula1attempt1.services.RaceService;
import bg.softuni.formula1attempt1.services.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class RaceServiceImpl implements RaceService {

    private final RaceRepository raceRepository;

    private final UserService userService;

    private final ModelMapper modelMapper;

    public RaceServiceImpl(RaceRepository raceRepository, UserService userService, ModelMapper modelMapper) {
        this.raceRepository = raceRepository;
        this.userService = userService;
        this.modelMapper = modelMapper;
    }

    @Override
    public void add(AddRaceBindingModel addRaceBindingModel) {
        Race race = modelMapper.map(addRaceBindingModel,Race.class);

        User user = userService.getLoggedUser();
        race.setAuthor(user);

        raceRepository.save(race);

    }
}
