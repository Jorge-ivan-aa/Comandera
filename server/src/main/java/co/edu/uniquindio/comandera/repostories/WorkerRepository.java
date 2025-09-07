package co.edu.uniquindio.comandera.repostories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.edu.uniquindio.comandera.Entity.Worker;

@Repository
public interface WorkerRepository extends CrudRepository<Worker, String> {
    // 
}
