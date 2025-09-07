package co.edu.uniquindio.comandera.repostories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.edu.uniquindio.comandera.Entity.Admin;

@Repository
public interface AdminRepository extends CrudRepository<Admin, Long> {
    // 
}