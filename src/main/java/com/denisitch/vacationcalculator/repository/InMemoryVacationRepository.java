package com.denisitch.vacationcalculator.repository;

import com.denisitch.vacationcalculator.entity.VacationData;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryVacationRepository implements VacationRepository {

    private final List<VacationData> vacationDataList = new ArrayList<>();
}
