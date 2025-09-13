package co.edu.uniquindio.comandera.domain.model;

import co.edu.uniquindio.comandera.domain.model.enums.AreaType;

public record Area(
    String name,
    AreaType type
) {
}
