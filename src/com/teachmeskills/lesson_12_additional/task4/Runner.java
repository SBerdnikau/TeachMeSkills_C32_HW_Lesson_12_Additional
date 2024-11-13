package com.teachmeskills.lesson_12_additional.task4;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the deposit amount (in rubles): ");
        double a = scanner.nextDouble();

        System.out.print("Enter the number of years: ");
        int years = scanner.nextInt();

        double interestRate = 0.10; // 10%

        double futureValue = Bank.calculateFutureValue(a, years, interestRate);

        System.out.printf("The amount in the account after %d years will be: %.2f rubles", years, futureValue);

        scanner.close();
    }

}
