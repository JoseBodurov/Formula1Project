package bg.softuni.formula1attempt1.controller;

import bg.softuni.formula1attempt1.models.User;
import bg.softuni.formula1attempt1.models.dto.UserLoginBindingModel;
import bg.softuni.formula1attempt1.models.dto.UserRegisterBindingModel;
import bg.softuni.formula1attempt1.models.view.UserProfileView;
import bg.softuni.formula1attempt1.services.AuthenticationService;
import bg.softuni.formula1attempt1.services.UserService;
import bg.softuni.formula1attempt1.services.impl.AuthenticationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {
    private final AuthenticationService authenticationService;

    private final UserService userService;

    public UserController(AuthenticationService authenticationService, UserService userService) {
        this.authenticationService = authenticationService;
        this.userService = userService;
    }


    @GetMapping("/login")
    public ModelAndView login(){
        return new ModelAndView("login");
    }
    @PostMapping("/login")
    public ModelAndView login(UserLoginBindingModel userLoginBidingModel){
        boolean isLogged = authenticationService.login(userLoginBidingModel);

        if(isLogged){
            return new ModelAndView("redirect:/");
        }

        return new ModelAndView("login");
    }
    @GetMapping("/register")
    public ModelAndView register(){
        return new ModelAndView("register");
    }
    @PostMapping("/register")
    public ModelAndView register(UserRegisterBindingModel userRegisterBindingModel){
        this.authenticationService.register(userRegisterBindingModel);


        return new ModelAndView("redirect:login");
    }
    @GetMapping("/logout")
    public ModelAndView logout(){
        this.authenticationService.logout();

        return new ModelAndView("redirect:/");
    }

    @GetMapping("/profile")
    public ModelAndView profile(){
        UserProfileView userProfile = userService.getUserProfile();
        ModelAndView modelAndView = new ModelAndView("profile");
        modelAndView.addObject("userProfileModel",userProfile);

        return modelAndView;
    }



}
