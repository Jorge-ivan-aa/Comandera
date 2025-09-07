package co.edu.uniquindio.comandera.repostories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.edu.uniquindio.comandera.Entity.Area;

@Repository
public interface AreaRepository extends CrudRepository<Area, Long> {
    // 
}