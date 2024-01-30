package bg.softuni.formula1attempt1.services.impl;

import bg.softuni.formula1attempt1.models.User;
import bg.softuni.formula1attempt1.models.dto.UserLoginBindingModel;
import bg.softuni.formula1attempt1.models.dto.UserRegisterBindingModel;
import bg.softuni.formula1attempt1.repositories.UserRepository;
import bg.softuni.formula1attempt1.services.AuthenticationService;
import bg.softuni.formula1attempt1.services.session.LoggedUser;
import org.modelmapper.ModelMapper;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {
    private final UserRepository userRepository;

    private final ModelMapper modelMapper;

    private final PasswordEncoder passwordEncoder;

    private final LoggedUser loggedUser;

    public AuthenticationServiceImpl(UserRepository userRepository, ModelMapper modelMapper, PasswordEncoder passwordEncoder, LoggedUser loggedUser) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
        this.passwordEncoder = passwordEncoder;
        this.loggedUser = loggedUser;
    }

    @Override
    public void register(UserRegisterBindingModel userRegisterBindingModel) {
        User user = modelMapper.map(userRegisterBindingModel,User.class);
        user.setPassword(passwordEncoder.encode(userRegisterBindingModel.getPassword()));
        userRepository.save(user);
    }

    @Override
    public boolean login(UserLoginBindingModel userLoginBidingModel) {
        String username = userLoginBidingModel.getUsername();
        User user = this.userRepository.findByUsername(username );
        if (user == null) {
            throw new IllegalArgumentException("User with username: "+ username +" is not present");
        }

        boolean passwordMatch = passwordEncoder.matches(userLoginBidingModel.getPassword(), user.getPassword());

        if(!passwordMatch){
            throw new IllegalArgumentException("User entered incorrect password");
        }

        loggedUser.setUsername(user.getUsername());
        loggedUser.setEmail(user.getEmail());
        loggedUser.setFullName(user.getFullName());
        loggedUser.setLogged(true);

        return passwordMatch;
    }

    @Override
    public void logout() {
        loggedUser.reset();
    }
}
