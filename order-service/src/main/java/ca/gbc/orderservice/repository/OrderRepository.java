package ca.gbc.orderservice.repository;

import ca.gbc.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.mongodb.repository.DeleteQuery;

public interface OrderRepository extends JpaRepository<Order, Long> {
//    @DeleteQuery
//    public void deleteById(String Id);
}
