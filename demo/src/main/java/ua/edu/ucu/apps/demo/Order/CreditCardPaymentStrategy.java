package ua.edu.ucu.apps.demo.Order;

public class CreditCardPaymentStrategy implements Payment{
    boolean paid = false;
    @Override
    public void pay() {
        paid = true;
    }
}
