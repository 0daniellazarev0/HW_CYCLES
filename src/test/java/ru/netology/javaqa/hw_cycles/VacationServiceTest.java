package ru.netology.javaqa.hw_cycles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class VacationServiceTest {
    @ParameterizedTest
    @CsvFileSource (files="src/test/resources/vacationTestData.csv")
    public void checkWhenYouAreOnVacation(int income, int threshold, int expenses, int expectedResult) {
        VacationService service = new VacationService();
        int vacationMonths = service.calculate(income, threshold, expenses);
        System.out.println();
        System.out.println("С моими текущими доходами и тратами получится отдохнуть столько месяцев в этом году: " + vacationMonths);
        System.out.println();
        System.out.println();
        Assertions.assertEquals(expectedResult, vacationMonths);
    }
}
