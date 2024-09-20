package com.denisitch.vacationcalculator.service;

import com.denisitch.vacationcalculator.dto.VacationDTO;
import com.denisitch.vacationcalculator.entity.VacationData;

public interface VacationService {
    VacationData calculate(VacationDTO dto);
}
