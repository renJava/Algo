package ru.bmi.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

//Класс для загрузки ограничений валидации из файла constraints.yml
/*
@Data
@ConfigurationProperties(prefix = "bmi.constraints")
public class ValidationProperties {

    private Range height;
    private Range weight;
    private Range age;

    @Data
    public static class Range {
        private double min;
        private double max;
    }
}
*/
