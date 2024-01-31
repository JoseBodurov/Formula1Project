package bg.softuni.formula1attempt1.services.impl;

import bg.softuni.formula1attempt1.models.User;
import bg.softuni.formula1attempt1.models.view.UserProfileView;
import bg.softuni.formula1attempt1.repositories.UserRepository;
import bg.softuni.formula1attempt1.services.UserService;
import bg.softuni.formula1attempt1.services.session.LoggedUser;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    private final UserRepository usersRepository;
    private final LoggedUser loggedUser;

    private final ModelMapper modelMapper;

    @Autowired
    public UserServiceImpl(UserRepository usersRepository, LoggedUser loggedUser, ModelMapper modelMapper) {
        this.usersRepository = usersRepository;
        this.loggedUser = loggedUser;
        this.modelMapper = modelMapper;
    }

    @Override
    public User getLoggedUser() {
        return usersRepository.findByUsername(loggedUser.getUsername());
    }

    @Override
    public UserProfileView getUserProfile(){
        User user = usersRepository.findByUsername(loggedUser.getUsername());

        UserProfileView userProfileView = modelMapper.map(user,UserProfileView.class);
        return userProfileView;
    }
}
