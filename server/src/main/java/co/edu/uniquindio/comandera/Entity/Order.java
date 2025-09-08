package co.edu.uniquindio.comandera.Entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
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
    
    @ManyToOne
    @JoinColumn(name = "worker_id")
    private Worker worker;
    
    @ManyToOne
    @JoinColumn(name = "table_id")
    private co.edu.uniquindio.comandera.Entity.Table table;
    
    @OneToMany(mappedBy = "order")
    private Set<OrderProduct> products;
    
    public Order() {
        this.products = new HashSet<>();
    }

    public Order(
        Worker worker,
        co.edu.uniquindio.comandera.Entity.Table table,
        Float total
    ) {
        this();
        this.total = total;
        this.worker = worker;
        this.table = table;
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

    public co.edu.uniquindio.comandera.Entity.Table getTable() {
        return table;
    }

    public void setTable(co.edu.uniquindio.comandera.Entity.Table table) {
        this.table = table;
    }

    public Set<OrderProduct> getProducts() {
        return products;
    }

    public void setProducts(Set<OrderProduct> products) {
        this.products = products;
    }
}
