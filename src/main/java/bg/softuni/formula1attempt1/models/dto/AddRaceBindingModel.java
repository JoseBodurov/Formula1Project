package bg.softuni.formula1attempt1.models.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AddRaceBindingModel {

    private String raceName;

    @Size(min = 5, message = "Description length must be more than 5 characters")
    private String experienceDescription;

    @Pattern(regexp = "https:\\/\\/www\\.youtube\\.com\\/watch\\?v=.*", message = "Invalid youtube url provided")
    private String videoUrl;

}
