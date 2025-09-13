package co.edu.uniquindio.comandera.domain.model;

public record Worker(
    User user,
    String identification,
    String phone,
    String image,
    String address,
    String observations,
    Boolean enable
) {
}
