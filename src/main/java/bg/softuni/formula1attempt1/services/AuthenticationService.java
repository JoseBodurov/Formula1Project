package bg.softuni.formula1attempt1.services;

import bg.softuni.formula1attempt1.models.dto.UserLoginBindingModel;
import bg.softuni.formula1attempt1.models.dto.UserRegisterBindingModel;
import org.springframework.stereotype.Service;

@Service
public interface AuthenticationService {
    void register(UserRegisterBindingModel userRegisterBindingModel);

    boolean login(UserLoginBindingModel userLoginBidingModel);

    void logout();
}
