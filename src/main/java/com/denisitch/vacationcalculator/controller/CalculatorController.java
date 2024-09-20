package com.denisitch.vacationcalculator.controller;

import com.denisitch.vacationcalculator.dto.VacationDTO;
import com.denisitch.vacationcalculator.entity.VacationData;
import com.denisitch.vacationcalculator.service.VacationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("vacation-api/")
@RequiredArgsConstructor
public class CalculatorController {

    private final VacationService vacationService;

    @GetMapping
    public ResponseEntity<VacationData> calculateVacation(@RequestBody VacationDTO dto) {
        return new ResponseEntity<>(vacationService.calculate(dto), HttpStatus.OK);
    }
}
