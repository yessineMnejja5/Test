package tn.esprit.test_test.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.test_test.Entities.Restaurant;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {

}
