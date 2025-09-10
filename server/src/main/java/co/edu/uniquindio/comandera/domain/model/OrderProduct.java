package co.edu.uniquindio.comandera.domain.model;

public record OrderProduct(
    Integer id,
    Order order,
    Product product,
    String name,
    Float price,
    Integer quantity,
    String image
) {
}
