package co.edu.uniquindio.comandera.Entity;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "daymenus")
public class DayMenu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private LocalDateTime creation;
    
    @OneToMany(mappedBy = "dayMenu", cascade = CascadeType.REMOVE, orphanRemoval = true)
    private Set<DayMenuProduct> products;
    
    public DayMenu() {
        this.products = new HashSet<>();
    }

    public DayMenu(LocalDateTime creation) {
        this();
        this.creation = creation;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getCreation() {
        return creation;
    }

    public void setCreation(LocalDateTime creation) {
        this.creation = creation;
    }

    public Set<DayMenuProduct> getProducts() {
        return products;
    }

    public void setProducts(Set<DayMenuProduct> products) {
        this.products = products;
    }
}
