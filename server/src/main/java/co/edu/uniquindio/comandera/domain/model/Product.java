package co.edu.uniquindio.comandera.domain.model;

import java.time.LocalDateTime;
import java.util.Set;

import co.edu.uniquindio.comandera.domain.model.enums.ProductStatus;

public record Product(
    Integer id,
    String name,
    String description,
    Integer estimateTime,
    Area preparationArea,
    ProductStatus status,
    LocalDateTime prepararationDate,
    String image,
    Set<Category> categories
) {
}
