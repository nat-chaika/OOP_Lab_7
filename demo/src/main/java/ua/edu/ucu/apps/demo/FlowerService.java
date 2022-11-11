package ua.edu.ucu.apps.demo;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.edu.ucu.apps.demo.flower_store.Flower;
import ua.edu.ucu.apps.demo.flower_store.FlowerRepository;

import java.util.List;

@Service
public class FlowerService {
    @Autowired
    private FlowerRepository flowerRepository;
    public FlowerService(FlowerRepository flowerRepository) {
        this.flowerRepository = flowerRepository;
    }
    public List<Flower> getFlowers() {
        return flowerRepository.findAll();
    }
}