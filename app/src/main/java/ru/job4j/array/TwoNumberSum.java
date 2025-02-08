package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int firstPointer = 0;
        int secondPointer = array.length - 1;
        while (firstPointer < secondPointer) {
            if (array[firstPointer] + array[secondPointer] == target) {
                return new int[]{firstPointer, secondPointer};
            } else if (array[firstPointer] + array[secondPointer] < target) {
                firstPointer++;
            } else {
                secondPointer--;
            }
        }
        return new int[0];
    }
}