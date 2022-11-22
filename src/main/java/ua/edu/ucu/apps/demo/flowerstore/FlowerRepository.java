package ua.edu.ucu.apps.demo.flowerstore;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.edu.ucu.apps.demo.flowerstore.Flower;

@Repository
public interface FlowerRepository extends JpaRepository<Flower, Integer> {
}
