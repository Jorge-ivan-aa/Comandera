package co.edu.uniquindio.comandera.Entity;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import co.edu.uniquindio.comandera.Entity.enums.ProductStatus;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(
    name = "products",
    uniqueConstraints = @UniqueConstraint(columnNames = { "name" })
)
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    
    private Float price;

    @Column(nullable = true)
    private String description;

    @Column(nullable = true)
    private Integer estimateTime;
    
    @ManyToOne
    @JoinColumn(name = "preparation_area")
    private Area preparationArea;

    private ProductStatus status;
    
    @Column(name = "prepare_for", nullable = true)
    private LocalDateTime prepararationDate;
    
    @Column(nullable = true)
    private String image;
    
    @ManyToMany
    @JoinTable(
        name = "product_categories",
        joinColumns = @JoinColumn(name = "product_id"),
        inverseJoinColumns = @JoinColumn(name = "category_id")
    )
    private Set<Category> categories;
    
    @OneToMany(mappedBy = "product")
    private Set<DayMenuProduct> menus;
    
    @OneToMany(mappedBy = "product")
    private Set<OrderProduct> orders;

    public Product() {
        this.menus = new HashSet<>();
        this.orders = new HashSet<>();
        this.categories = new HashSet<>();
    }

    public Product(
        String name,
        Float price,
        String description,
        Integer estimateTime,
        Area preparationArea,
        ProductStatus status,
        LocalDateTime prepararationDate,
        String image
    ) {
        this();
        this.name = Objects.requireNonNull(name);
        this.price = Objects.requireNonNull(price);
        this.description = description;
        this.estimateTime = estimateTime;
        this.preparationArea = Objects.requireNonNull(preparationArea);
        this.status = Objects.requireNonNull(status);
        this.prepararationDate = prepararationDate;
        this.image = image;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getEstimateTime() {
        return estimateTime;
    }

    public void setEstimateTime(Integer estimateTime) {
        this.estimateTime = estimateTime;
    }

    public Area getPreparationArea() {
        return preparationArea;
    }

    public void setPreparationArea(Area preparationArea) {
        this.preparationArea = preparationArea;
    }

    public ProductStatus getStatus() {
        return status;
    }

    public void setStatus(ProductStatus status) {
        this.status = status;
    }

    public LocalDateTime getPrepararationDate() {
        return prepararationDate;
    }

    public void setPrepararationDate(LocalDateTime prepararationDate) {
        this.prepararationDate = prepararationDate;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Set<Category> getCategories() {
        return categories;
    }

    public void setCategories(Set<Category> categories) {
        this.categories = categories;
    }

    public Set<DayMenuProduct> getMenus() {
        return menus;
    }

    public void setMenus(Set<DayMenuProduct> menus) {
        this.menus = menus;
    }

    public Set<OrderProduct> getOrders() {
        return orders;
    }

    public void setOrders(Set<OrderProduct> orders) {
        this.orders = orders;
    }
}
