package bg.softuni.formula1attempt1.services;

import bg.softuni.formula1attempt1.models.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    User getLoggedUser();
}
