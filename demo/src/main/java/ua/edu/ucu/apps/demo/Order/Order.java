package ua.edu.ucu.apps.demo.Order;

import lombok.Getter;
import lombok.Setter;
import ua.edu.ucu.apps.demo.flower_store.FlowerBucket;

import java.util.ArrayList;
import java.util.List;

@Getter @Setter
public class Order {
    private List<Item> items = new ArrayList<>();
    private Payment typeOfPayment;
    private Delivery typeOfDelivery;
    private int numOfItems;

    public void add(Item item){
        items.add(item);
        numOfItems = items.size();
    }
}
