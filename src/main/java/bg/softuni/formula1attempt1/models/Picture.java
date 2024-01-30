package bg.softuni.formula1attempt1.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "pictures")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Picture {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title",nullable = false)
    private String title;

    @Column(name = "url_address",nullable = false)
    private String url;

    @ManyToOne
    private User author;

    @ManyToOne
    private Race race;



}
