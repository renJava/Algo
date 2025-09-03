package ru.bmi.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class BmiRequest {

    private static final double MIN_HEIGHT = 0.5;
    private static final double MAX_HEIGHT = 2.5;
    private static final double MIN_WEIGHT = 10;
    private static final double MAX_WEIGHT = 300;
    private static final int MIN_AGE = 1;
    private static final int MAX_AGE = 120;

    @DecimalMin(value = "" + MIN_HEIGHT, message = "Рост должен быть больше " + MIN_HEIGHT + " м")
    @DecimalMax(value = "" + MAX_HEIGHT, message = "Рост должен быть меньше " + MAX_HEIGHT + " м")
    @Schema(description = "Рост в метрах", example = "1.75", minimum = "" + MIN_HEIGHT, maximum = "" + MAX_HEIGHT)
    private double height;

    @DecimalMin(value = "" + MIN_WEIGHT, message = "Вес должен быть больше " + MIN_WEIGHT + " кг")
    @DecimalMax(value = "" + MAX_WEIGHT, message = "Вес должен быть меньше " + MAX_WEIGHT + " кг")
    @Schema(description = "Вес в килограммах", example = "70", minimum = "" + MIN_WEIGHT, maximum = "" + MAX_WEIGHT)
    private double weight;

    @Min(value = MIN_AGE, message = "Возраст должен быть больше " + MIN_AGE)
    @Max(value = MAX_AGE, message = "Возраст не может быть больше " + MAX_AGE + " лет")
    @Schema(description = "Возраст в годах", example = "30", minimum = "" + MIN_AGE, maximum = "" + MAX_AGE)
    private int age;

    @NotNull(message = "Пол обязателен")
    @Schema(description = "Пол: MALE или FEMALE", example = "MALE")
    private Gender gender;

    public enum Gender {
        MALE, FEMALE
    }
}