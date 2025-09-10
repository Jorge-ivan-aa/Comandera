package co.edu.uniquindio.comandera.repostories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.edu.uniquindio.comandera.infraestructure.entity.Table;

@Repository
public interface TableRepository extends CrudRepository<Table, Long> {
    // 
}
