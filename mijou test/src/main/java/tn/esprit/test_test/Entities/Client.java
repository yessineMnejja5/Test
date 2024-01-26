package tn.esprit.test_test.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Client {
    @Id
    Long idClient;
    @Column
    String identifiant;
    @Column
    LocalDate datePremiereVisite;
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Menu>menus;
}
