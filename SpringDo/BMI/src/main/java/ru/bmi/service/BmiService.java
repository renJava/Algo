package ru.bmi.service;

import org.springframework.stereotype.Service;
import ru.bmi.dto.BmiRequest;
import ru.bmi.dto.BmiResponse;

@Service
public class BmiService {

    public BmiResponse calculateBmi(BmiRequest request) {

        double weight = request.getWeightKg();
        double height = request.getHeightCm()/100;

/*
        if (request.getHeightCm() <= 90) {
            return new BmiResponse(Double.NaN, "⛔ Invalid height");
        }

        if (weight <= 10) {
            return new BmiResponse(Double.NaN, "\uD83D\uDEAB Invalid weight");
        }
*/

        double baseBmi = weight / Math.pow(height, 2);

        // Коррекция по полу
        if (request.getGender() == BmiRequest.Gender.MALE) {
            baseBmi *= 1.1;
        } else if (request.getGender() == BmiRequest.Gender.FEMALE) {
            baseBmi *= 0.9;
        }

        // Коррекция по возрасту
        if (request.getAge() > 50) {
            baseBmi *= 1.05;
        } else if (request.getAge() < 18) {
            baseBmi *= 0.95;
        }

        // ⬇️ Округляем до двух знаков
        double roundedBmi = Math.round(baseBmi * 100.0) / 100.0;

        String category = getCategory(baseBmi);

        return new BmiResponse(roundedBmi, category);
    }

    private String getCategory(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 25) return "Normal weight";
        else if (bmi < 30) return "Overweight";
        else return "Obesity";
    }
}
