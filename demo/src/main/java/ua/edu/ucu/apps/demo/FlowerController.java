package ua.edu.ucu.apps.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ua.edu.ucu.apps.demo.flower_store.Flower;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/flower")
public class FlowerController {

    private final FlowerService flowerService;
    @Autowired
    public FlowerController(FlowerService flowerService) {
        this.flowerService = flowerService;
    }
    @GetMapping
    public List<Flower> getFlower() {
        return flowerService.getFlowers();
    }
}
