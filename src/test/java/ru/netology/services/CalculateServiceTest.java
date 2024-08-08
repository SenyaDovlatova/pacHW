package ru.netology.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class CalculateServiceTest {

    @Test
    void restForThreeMonths() {
        CalculateService service = new CalculateService();

        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;
        int expected = 3;

        long actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void restForFiveMonths() {
        CalculateService service = new CalculateService();

        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;
        int expected = 2;

        long actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }
}
