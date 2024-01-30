package bg.softuni.formula1attempt1.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username",nullable = false,unique = true)
    private String username;

    @Column(name = "password",nullable = false)
    private String password;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "email",nullable = false,unique = true)
    private String email;

    @ManyToMany(fetch = FetchType.EAGER)
    private Set<Role> role;
}
