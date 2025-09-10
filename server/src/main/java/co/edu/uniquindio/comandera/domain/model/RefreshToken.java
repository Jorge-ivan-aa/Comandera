package co.edu.uniquindio.comandera.domain.model;

public record RefreshToken(
    Integer id,
    User user,
    String token
) {
    
}
