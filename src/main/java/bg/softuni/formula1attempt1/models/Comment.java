package bg.softuni.formula1attempt1.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "comments")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "approved")
    private Boolean approved;

    @Column(name = "date_time",nullable = false)
    private LocalDateTime dateTime;

    @Column(name = "textConcept",columnDefinition = "TEXT",nullable = false)
    private String textConcept;

    @ManyToOne
    private User author;

    @ManyToOne
    private Race race;

}
