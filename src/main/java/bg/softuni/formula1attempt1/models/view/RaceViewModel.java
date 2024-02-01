package bg.softuni.formula1attempt1.models.view;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
public class RaceViewModel {
    Long id;
    String imageUrl;
    String name;
    String description;
}
