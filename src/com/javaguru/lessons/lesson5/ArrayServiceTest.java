package com.javaguru.lessons.lesson5;

class ArrayServiceTest {

    public static void main(String[] args) {
        ArrayServiceTest testRunner = new ArrayServiceTest();
        testRunner.shouldReturnSumOfArray55();
        testRunner.shouldReturnAvg();
    }

    void shouldReturnSumOfArray55() {
        ArrayService arrayService = new ArrayService();
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int actual = arrayService.sum(array);
        int expected = 55;

        if (actual == expected) {
            System.out.println("shouldReturnSumOfArray55: SUCCESS");
        } else {
            System.out.println("shouldReturnSumOfArray55: FAILED, expected: " + expected + " but was " + actual);
        }
    }

    void shouldReturnAvg() {
        ArrayService arrayService = new ArrayService();
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double actual = arrayService.avg(array);
        double expected = 5.5;

        if (actual == expected) {
            System.out.println("shouldReturnAvg: SUCCESS");
        } else {
            System.out.println("shouldReturnAvg: FAILED, expected: " + expected + " but was " + actual);
        }
    }
}
