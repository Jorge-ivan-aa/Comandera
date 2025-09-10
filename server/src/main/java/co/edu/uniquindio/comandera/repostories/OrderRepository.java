package co.edu.uniquindio.comandera.repostories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.edu.uniquindio.comandera.infrastructure.entity.Order;

@Repository
public interface OrderRepository extends CrudRepository<Order, Long> {
    // 
}