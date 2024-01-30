package bg.softuni.formula1attempt1.services.session;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class LoggedUser {
    private String username;
    private String email;
    private String fullName;
    private boolean isLogged;

    public void reset() {
        setUsername(null);
        setEmail(null);
        setFullName(null);
        setLogged(false);
    }
}
