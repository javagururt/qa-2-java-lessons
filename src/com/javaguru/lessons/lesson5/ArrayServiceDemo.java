package com.javaguru.lessons.lesson5;

import java.util.Arrays;

class ArrayServiceDemo {

    public static void main(String[] args) {
        ArrayService arrayService = new ArrayService();

        int[] integers = new int[5];

        System.out.println(Arrays.toString(integers));

        arrayService.fillWithRandomNumbers(integers);

        System.out.println(Arrays.toString(integers));

    }
}
