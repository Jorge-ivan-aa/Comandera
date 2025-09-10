package co.edu.uniquindio.comandera.infraestructure.entity;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private Float total;
    
    private LocalDateTime creation;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "worker_id")
    @OnDelete(action = OnDeleteAction.SET_NULL)
    private Worker worker;
    
    @ManyToOne
    @JoinColumn(name = "table_id")
    @OnDelete(action = OnDeleteAction.SET_NULL)
    private co.edu.uniquindio.comandera.infraestructure.entity.Table table;
    
    @OneToMany(mappedBy = "order", cascade = CascadeType.REMOVE, orphanRemoval = true)
    private Set<OrderProduct> products;
    
    public Order() {
        this.products = new HashSet<>();
    }

    public Order(
        Worker worker,
        co.edu.uniquindio.comandera.infraestructure.entity.Table table,
        Float total,
        LocalDateTime creation
    ) {
        this();
        this.total = total;
        this.worker = worker;
        this.table = table;
        this.creation = creation;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    public Worker getWorker() {
        return worker;
    }

    public void setWorker(Worker worker) {
        this.worker = worker;
    }

    public co.edu.uniquindio.comandera.infraestructure.entity.Table getTable() {
        return table;
    }

    public void setTable(co.edu.uniquindio.comandera.infraestructure.entity.Table table) {
        this.table = table;
    }

    public LocalDateTime getCreation() {
        return creation;
    }

    public void setCreation(LocalDateTime creation) {
        this.creation = creation;
    }

    public Set<OrderProduct> getProducts() {
        return products;
    }

    public void setProducts(Set<OrderProduct> products) {
        this.products = products;
    }
}
