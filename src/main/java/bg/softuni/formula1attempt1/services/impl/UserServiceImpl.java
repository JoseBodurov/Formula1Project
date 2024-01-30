package bg.softuni.formula1attempt1.services.impl;

import bg.softuni.formula1attempt1.models.User;
import bg.softuni.formula1attempt1.repositories.UserRepository;
import bg.softuni.formula1attempt1.services.UserService;
import bg.softuni.formula1attempt1.services.session.LoggedUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    private final UserRepository usersRepository;
    private final LoggedUser loggedUser;

    @Autowired
    public UserServiceImpl(UserRepository usersRepository, LoggedUser loggedUser) {
        this.usersRepository = usersRepository;
        this.loggedUser = loggedUser;
    }

    @Override
    public User getLoggedUser() {
        return usersRepository.findByUsername(loggedUser.getUsername());
    }
}
