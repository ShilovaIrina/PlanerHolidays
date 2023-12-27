package ru.netology.PlanerHolidays.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculateServiceTest {

    @Test
    void workOrHolidays() {
        CalculateService service = new CalculateService();

        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;

        int holidays = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(3, holidays);
    }

}