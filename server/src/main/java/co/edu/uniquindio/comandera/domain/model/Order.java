package co.edu.uniquindio.comandera.domain.model;

import java.time.LocalDateTime;

public record Order(
    Integer id,
    Worker worker,
    Table table,
    LocalDateTime creation,
    Float total
) {
}
