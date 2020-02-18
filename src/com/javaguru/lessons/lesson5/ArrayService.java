package com.javaguru.lessons.lesson5;

import java.util.Random;

class ArrayService {

    void fillWithRandomNumbers(int[] array) {
        Random randomGenerator = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = randomGenerator.nextInt(101);
        }
    }

    int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i <= array.length - 1; i++) {
            sum += array[i];
        }
        /*
        for (int value : array) {
            sum += value;
        }
         */
        return sum;
    }

    double avg(int[] array) {
        double sum = sum(array);
        return sum / array.length;
    }
}
