package com.teachmeskills.lesson_12_additional.task7;

/**
 * Дан массив целых чисел, найдите два числа, которые в сумме дают заданное число.
 * Функция twoSum должна возвращать индексы двух чисел так, чтобы они складывались
 * в целевое число.
 * Например:
 * Ввод: числа={2, 7, 11, 15}, цель=9.
 * Выход: индекс1=0, индекс2=1.
 */
public class Runner {
    public static void main(String[] args) {
        int[] inputArray = {2, 7, 11, 15};
        int result = 2;
        toSum(inputArray, result);
    }

    private static void toSum(int[] arrayInt, int sum){
        for (int i = 0; i < arrayInt.length; i++) {
            for (int j = i + 1; j < arrayInt.length; j++) {
                if (arrayInt[i] + arrayInt[j] == sum ){
                    System.out.println("Index1 = " + i);
                    System.out.println("Index2 = " + j);
                }
            }
        }
    }
}