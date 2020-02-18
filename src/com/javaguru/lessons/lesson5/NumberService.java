package com.javaguru.lessons.lesson5;

class NumberService {

    public int sumRange(int start, int finish) {
        int sum = 0;

        while (start <= finish) {
            sum = sum + start;
            start++;
        }

        return sum;
    }

    public int rangeEvenCount(int start, int finish) {
        int evenNumberCount = 0;

        while (start <= finish) {
            if (start % 2 == 0) {
                evenNumberCount++; // +1
            }
            start++;
        }
        return evenNumberCount;
    }
}
