package co.edu.uniquindio.comandera.repostories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.edu.uniquindio.comandera.Entity.DayMenu;

@Repository
public interface DayMenuRepository extends CrudRepository<DayMenu, Long> {
    // 
}
