package bg.softuni.formula1attempt1.models.view;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
public class UserProfileView {
    private String username;
    private String fullName;
    private int age;

}
