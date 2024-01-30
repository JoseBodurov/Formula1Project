package bg.softuni.formula1attempt1.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "races")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Race {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "race-name")
    private String raceName;

    @Column(name = "experience-description",columnDefinition = "TEXT")
    private String experienceDescription;

    @Column
    private String videoUrl;

    @ManyToOne
    private User author;



}
