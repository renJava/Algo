package ru.bmi.controller;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import ru.bmi.dto.BmiRequest;
import ru.bmi.dto.BmiResponse;
import ru.bmi.service.BmiService;

@RestController
@RequestMapping("/bmi")
public class BmiController {
    private final BmiService bmiService;

    public BmiController(BmiService bmiService) {
        this.bmiService = bmiService;
    }

    @PostMapping("/calculate")
    public BmiResponse calculateBmi(@Valid @RequestBody BmiRequest request) {
        return bmiService.calculateBmi(request);
    }
}
