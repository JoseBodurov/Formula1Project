package bg.softuni.formula1attempt1.models.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserRegisterBindingModel {

    private String username;
    private String fullName;
    private String email;
    private int age;
    private String password;
    private String confirmPassword;
}
