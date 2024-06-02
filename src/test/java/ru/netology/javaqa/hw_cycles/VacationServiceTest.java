package ru.netology.javaqa.hw_cycles;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class VacationServiceTest {
@ParameterizedTest
@CsvSource("100000, 150000, 60000" )
    public void checkWhenYouAreOnVacation (int income, int threshold, int expenses) {
    VacationService service = new VacationService();
     int accountBalance = service.calculate(income, threshold, expenses);
     System.out.println(accountBalance);
}
}
