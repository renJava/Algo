package ru.bmi.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.media.Schema;
import lombok.RequiredArgsConstructor;
import org.springdoc.core.customizers.OpenApiCustomizer;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Map;

/*
@Component
@RequiredArgsConstructor
public class ConstraintsOpenApiCustomizer implements OpenApiCustomizer {

    private final ValidationProperties props;

    @Override
    public void customise(OpenAPI openApi) {
        Map<String, Schema> schemas = openApi.getComponents().getSchemas();
        System.out.println("Schemas found: " + schemas.keySet()); // для дебага

        Schema<?> schema = schemas.get("BmiRequest"); // имя проверить в логах
        if (schema != null) {
            updateField(schema, "height", props.getHeight().getMin(), props.getHeight().getMax());
            updateField(schema, "weight", props.getWeight().getMin(), props.getWeight().getMax());
            updateField(schema, "age", props.getAge().getMin(), props.getAge().getMax());
        }
    }

    private void updateField(Schema<?> schema, String field, double min, double max) {
        Schema<?> property = (Schema<?>) schema.getProperties().get(field);
        if (property != null) {
            property.setMinimum(BigDecimal.valueOf(min));
            property.setMaximum(BigDecimal.valueOf(max));
            property.setExample((min + max) / 2);
        }
    }
}
*/
