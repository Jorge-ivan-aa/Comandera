package co.edu.uniquindio.comandera.repostories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.edu.uniquindio.comandera.Entity.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
    // 
}
