package co.edu.uniquindio.comandera.Entity.converters;

import co.edu.uniquindio.comandera.Entity.enums.ProductStatus;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class ProductStatusConverter implements AttributeConverter<ProductStatus, String> {
    @Override
    public String convertToDatabaseColumn(ProductStatus attribute) {
        return attribute.name();
    }
    
    @Override
    public ProductStatus convertToEntityAttribute(String dbData) {
        return ProductStatus.valueOf(dbData);
    }
}
