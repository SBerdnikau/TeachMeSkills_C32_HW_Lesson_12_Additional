package com.teachmeskills.lesson_12_additional.task2;

import java.util.Scanner;

/**
 * Вводится число любой длины (от нуля и до бесконечности). Надо найти сумму его
 * чисел.
 */
public class Runner {
    public static void main(String[] args) {

        toSum();

    }

    private static void toSum(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert digit number: ");
        String digitNumber = scanner.nextLine();
        String[] charactersArray = digitNumber.split("");
        int result = 0;
        for (String item : charactersArray) {
            result += Integer.parseInt(item);
        }
        System.out.println("Result = " + result);
    }

}