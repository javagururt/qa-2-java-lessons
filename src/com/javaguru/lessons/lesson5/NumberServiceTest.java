package com.javaguru.lessons.lesson5;

class NumberServiceTest {

    public static void main(String[] args) {
        NumberServiceTest testRunner = new NumberServiceTest();
        testRunner.shouldReturnSumResult55from0to10();
        testRunner.shouldReturnCountResult6from0to10();
    }

    void shouldReturnSumResult55from0to10() {
        NumberService victim = new NumberService();
        int actual = victim.sumRange(0, 10);
        int expectedResult = 55;

        if (actual == expectedResult) {
            System.out.println("shouldReturnSumResult55from0to10: SUCCESS");
        } else {
            System.out.println("shouldReturnSumResult55from0to10: FAILED, expected: " + expectedResult + " but was " + actual);
        }
    }

    void shouldReturnCountResult6from0to10() {
        NumberService victim = new NumberService();
        int actual = victim.rangeEvenCount(0, 10);
        int expectedResult = 6;

        if (actual == expectedResult) {
            System.out.println("shouldReturnCountResult6from0to10: SUCCESS");
        } else {
            System.out.println("shouldReturnCountResult6from0to10: FAILED, expected: " + expectedResult + " but was " + actual);
        }
    }


}
