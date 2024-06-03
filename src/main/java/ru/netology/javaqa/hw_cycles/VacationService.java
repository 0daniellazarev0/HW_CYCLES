package ru.netology.javaqa.hw_cycles;

public class VacationService {
    public int calculate(int income, int threshold, int expenses) {
        int accountBalance = 0;
        int vacationMonths = 0;
        for (int monthCount = 1; monthCount <= 12; monthCount++) {
            if (accountBalance < threshold) {
                int outputBalance = accountBalance;
                accountBalance = accountBalance + income - expenses;
                System.out.println("Месяц " + monthCount + ". Денег: ₽" + outputBalance + ". Придется работать. Заработал +" + income + ", потратил " + expenses);
            } else {
                int outputBalance = accountBalance;
                int vacationExpenses = accountBalance - expenses - ((accountBalance - expenses) / 3);
                accountBalance = (accountBalance - expenses) / 3;
                vacationMonths++;
                System.out.println("Месяц " + monthCount + ". Денег: ₽" + outputBalance + ". Буду отдыхать. Потратил " + expenses + ", а затем еще " + vacationExpenses);
            }
        }
        return vacationMonths;
    }
}
