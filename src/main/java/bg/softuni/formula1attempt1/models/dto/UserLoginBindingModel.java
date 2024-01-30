package bg.softuni.formula1attempt1.models.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserLoginBindingModel {
    private String username;

    private String password;
}
