package ca.gbc.orderservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name="t_order")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
//Could use @Data instead og Getter and Setter, even NoArgsContructor
public class Order {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;
     private String orderNumber;

     @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
     private List<OrderLineItem> orderLineItemList;
}
