package com.ourrooms;

public class Sorting {
    public static void main(String[] args) {
        int[] array = { 10, 3, 7, 2, 8 };

        selectionSort(array);
        printArray(array);
    }

    public static void (int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j+1]) {
                    swap(array, j, j+1);
                }
            }
        }
    }

    public static void selectionSort(int[] array) {
        int minIndex;

        for (int i = 0; i < array.length; i++) {
            minIndex = i;

            for (int j = i+1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            swap(array, i, minIndex);
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.print(array[i]);
            } else {
                System.out.print(array[i] + ", ");
            }
        }

        System.out.print("\n");
    }

    public static void swap(int[] array, int i, int j) {
        int temp;

        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
