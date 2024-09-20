package com.denisitch.vacationcalculator.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class VacationData {

    private Integer vacationId;

    private Double averageSalary;

    private Integer countOfVacationDays;

    private Double vacationRate;
}
