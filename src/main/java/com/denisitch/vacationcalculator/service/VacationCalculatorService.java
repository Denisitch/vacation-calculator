package com.denisitch.vacationcalculator.service;

import com.denisitch.vacationcalculator.dto.VacationDTO;
import com.denisitch.vacationcalculator.entity.VacationData;
import com.denisitch.vacationcalculator.repository.VacationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class VacationCalculatorService implements VacationService {

    private final VacationRepository vacationRepository;

    @Override
    public VacationData calculate(VacationDTO dto) {
        return null;
    }
}
