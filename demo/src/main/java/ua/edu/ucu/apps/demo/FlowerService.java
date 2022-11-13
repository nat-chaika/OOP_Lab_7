package ua.edu.ucu.apps.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
//import ua.edu.ucu.apps.demo.Flower;


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