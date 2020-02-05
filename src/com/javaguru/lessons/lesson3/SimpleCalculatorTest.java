package com.javaguru.lessons.lesson3;

public class SimpleCalculatorTest {

    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();

        int firstNumber = 10;
        int secondNumber = 15;

        int firstSumResult = calculator.sumOfTwoNumbers(firstNumber, secondNumber);
        System.out.println("First sum result = " + firstSumResult);

        int subtractResult = calculator.subtractOfTwoNumbers(30, 11);
        System.out.println("Subtract result = " + subtractResult);

    }
}
