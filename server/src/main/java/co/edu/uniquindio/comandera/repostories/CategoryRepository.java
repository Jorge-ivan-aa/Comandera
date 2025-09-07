package co.edu.uniquindio.comandera.repostories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.edu.uniquindio.comandera.Entity.Category;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {
    // 
}