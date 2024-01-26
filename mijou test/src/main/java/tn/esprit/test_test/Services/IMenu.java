package tn.esprit.test_test.Services;

import tn.esprit.test_test.Entities.Composant;
import tn.esprit.test_test.Entities.Menu;

import java.util.Set;

public interface IMenu {
    Menu ajouterComposantsEtMiseAjourPrixTotalMenu(Set<Composant> composants, Long idMenu);
}
