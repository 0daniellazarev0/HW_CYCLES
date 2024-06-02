package ru.netology.javaqa.hw_cycles;

public class VacationService {
    public int calculate (int income, int threshold, int expenses) {
        int accountBalance = 0;
        for (int monthCount = 0; monthCount < 12; monthCount++) {
            if (accountBalance <= threshold) {
                accountBalance = accountBalance + income;
            } else {
                accountBalance = (accountBalance - expenses) / 3;
            }
        } return accountBalance;
    }
}
