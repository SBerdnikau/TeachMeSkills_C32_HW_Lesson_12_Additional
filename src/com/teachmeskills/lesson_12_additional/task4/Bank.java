package com.teachmeskills.lesson_12_additional.task4;

public class Bank {

    public static double calculateFutureValue(double principal, int years, double interestRate) {
        for (int i = 0; i < years; i++) {
            principal += principal * interestRate;
        }
        return principal;
    }

}
