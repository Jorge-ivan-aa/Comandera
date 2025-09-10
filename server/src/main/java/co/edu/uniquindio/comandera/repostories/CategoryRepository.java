package co.edu.uniquindio.comandera.repostories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.edu.uniquindio.comandera.infrastructure.entity.Category;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {
    // 
}