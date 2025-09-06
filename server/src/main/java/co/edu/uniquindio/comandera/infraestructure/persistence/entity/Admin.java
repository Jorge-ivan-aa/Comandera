package co.edu.uniquindio.comandera.infraestructure.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Admin extends co.edu.uniquindio.comandera.Entity.User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    public Admin() {
    }

    public Admin(String name, String password) {
        super(name, password);
    }

    public Long getId() {
        return id;
    }
}
