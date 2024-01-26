package tn.esprit.test_test.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Menu {
    @Id
    Long idMenu;
    @Column
    String libelleMenu;
    @Column
    TypeMenu typeMenu;
    @Column
    Float prixTotal;
    @ManyToMany(mappedBy = "menus", cascade = CascadeType.ALL)
    private List<Client> clients;
}
