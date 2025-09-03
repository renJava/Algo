package ru.bmi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BmiResponse {
    private double roundedBmi;
    private String category;
}