package com.teachmeskills.lesson_12_additional.task5;

/**
 * Повернуть массив из n элементов вправо на k шагов.
 * Например, с n = 7 и k = 3 массив [1,2,3,4,5,6,7] вращается до [5,6,7,1,2,3,4].
 */
public class Runner {
    public static void main(String[] args) {
        int[] currentArray = {1,2,3,4,5,6,7};
        int k = 3;

        rotateArray(currentArray , k);

        for (int item : currentArray){
            System.out.print(item + " ");
        }
    }

    private static void rotateArray(int[] array, int k){
        int n = array.length;
        if (k > n){
            k = k % n; // В случае если k больше n
        }

        // Создаем временный массив для хранения последних k элементов
        int[] temp = new int[k];

        for (int i = 0; i < k; i++) {
            temp[i] = array[n - k + i];
        }

        // Сдвигаем элементы в оригинальном массиве
        for (int i = n - 1; i >= k; i--) {
            array[i] = array[i - k];
        }

        // Копируем элементы из временного массива обратно в оригинальный массив
        for (int i = 0; i < k; i++) {
            array[i] = temp[i];
        }
    }


}
