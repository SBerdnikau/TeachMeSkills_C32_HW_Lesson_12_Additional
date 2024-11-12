package com.teachmeskills.lesson_12_additional.task1;

import java.util.Scanner;

/**
 * Пользователь вводит трехзначное число.
 * Программа должна сложить цифры, из которых состоит это число.
 * Например, если было введено 349, программа должна вывести на экран число 16, так
 * как 3 + 4 + 9 = 16.
 */
public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert number: ");
        String digitNumber = scanner.nextLine();
        String[] charactersArray = digitNumber.split("");
        int result = 0;
        for (String item : charactersArray) {
            result += Integer.parseInt(item);
        }
        System.out.println("Result = " + result);
    }
}
