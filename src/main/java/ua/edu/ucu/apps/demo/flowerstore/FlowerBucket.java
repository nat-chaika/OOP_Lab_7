package ua.edu.ucu.apps.demo.flowerstore;
import lombok.Getter;
import lombok.Setter;
import ua.edu.ucu.apps.demo.flowerstore.FlowerPack;
import ua.edu.ucu.apps.demo.order.Item;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public class FlowerBucket extends Item {
    private ArrayList<FlowerPack> packs = new ArrayList<>();

    public void add(FlowerPack flowerPack) {
        packs.add(flowerPack);
    }

    public double getPrice() {
        int total = 0;
        for (FlowerPack pack : packs) {
            total += pack.getPrice();
        }
        return total;
    }
}
