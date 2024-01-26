package tn.esprit.test_test.Entities;

import jakarta.persistence.*;
import jakarta.persistence.Entity;
import lombok.*;

import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode

public class Restaurant {
    @Id
    Long idRestaurant;
    @Column
    String nom;
    @Column
    Long nbOlacesMax;
    @OneToMany(cascade = CascadeType.ALL)
    Set<Menu> menus;


}
