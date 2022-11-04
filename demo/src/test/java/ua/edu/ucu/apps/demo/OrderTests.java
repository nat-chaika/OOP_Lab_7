package ua.edu.ucu.apps.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.edu.ucu.apps.demo.Order.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderTests {
    private Order order = new Order();

    @BeforeEach
    public void init() {
        Item item = new Item();
        order.add(item);
    }

    @Test
    public void testProperties() {
        Payment pay1 = new PayPalPaymentStrategy();
        order.setTypeOfPayment(pay1);
        Delivery del1 = new PostDeliveryStrategy();
        order.setTypeOfDelivery(del1);
        Item newItem = new Item();
        order.add(newItem);
        assertEquals(2, order.getNumOfItems());
    }
}
