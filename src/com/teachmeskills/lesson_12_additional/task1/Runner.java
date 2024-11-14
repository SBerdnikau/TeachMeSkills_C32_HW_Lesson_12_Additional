package com.teachmeskills.lesson_12_additional.task1;

import javax.xml.stream.events.Characters;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Пользователь вводит трехзначное число.
 * Программа должна сложить цифры, из которых состоит это число.
 * Например, если было введено 349, программа должна вывести на экран число 16, так
 * как 3 + 4 + 9 = 16.
 */
public class Runner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert three-digit number: ");
        String digitNumber = scanner.nextLine();

        Pattern regexp = Pattern.compile("[0-9]{3}");
        Matcher matcher = regexp.matcher(digitNumber);
        if (matcher.matches()) {
            char[] charactersArray = digitNumber.toCharArray();
            int result = 0;
            for (char item : charactersArray) {
                 result += Character.getNumericValue(item);
            }
            System.out.println("Result = " + result);
        } else {
            System.out.println("Please! Insert only three-digit number! ");
        }

    }
}
