package ua.edu.ucu.apps.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import ua.edu.ucu.apps.demo.Order.Item;

@Getter @Setter @AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Flower extends Item {
    @Id
    @GeneratedValue
    private int id;
    private String color;
    private double petal;
    private double price;

}
