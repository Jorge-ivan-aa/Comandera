package co.edu.uniquindio.comandera.domain.model;

public record DayMenuProduct(
    Integer id,
    DayMenu menu,
    Product product,
    Integer quantity
) {
}
