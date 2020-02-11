package com.javaguru.lessons.lesson4;

class AquaParkVisitorAgeClassifierTest {

    public static void main(String[] args) {
        AquaParkVisitorAgeClassifierTest testRunner = new AquaParkVisitorAgeClassifierTest();
        testRunner.shouldReturnTadpoleWhenAge1();
        testRunner.shouldReturnTadpoleWhenAge7();
        testRunner.shouldReturnYoungFrogWhenAge13();
        testRunner.shouldReturnTeenWhenAge18();
        testRunner.shouldReturnHappyWhenAge30();
        testRunner.shouldReturnIncorrectAgeWhenAgeNegative();
        testRunner.shouldReturnJediWhenAge100();
    }

    void shouldReturnTadpoleWhenAge1() {
        AquaParkVisitorAgeClassifier victim = new AquaParkVisitorAgeClassifier();

        int age = 1;
        String expectedResult = "Tadpole";

        String actualResult = victim.classify(age);

        if (expectedResult.equals(actualResult)) {
            System.out.println("shouldReturnTadpoleWhenAge1 : SUCCESS");
        } else {
            System.out.println("shouldReturnTadpoleWhenAge1 : FAILED");
        }
    }

    void shouldReturnTadpoleWhenAge7() {
        AquaParkVisitorAgeClassifier victim = new AquaParkVisitorAgeClassifier();

        int age = 7;
        String expectedResult = "Tadpole";

        String actualResult = victim.classify(age);

        if (expectedResult.equals(actualResult)) {
            System.out.println("shouldReturnTadpoleWhenAge1 : SUCCESS");
        } else {
            System.out.println("shouldReturnTadpoleWhenAge1 : FAILED");
        }
    }

    void shouldReturnYoungFrogWhenAge13() {
        AquaParkVisitorAgeClassifier victim = new AquaParkVisitorAgeClassifier();

        int age = 13;
        String expectedResult = "Young frog";

        String actualResult = victim.classify(age);

        if (expectedResult.equals(actualResult)) {
            System.out.println("shouldReturnYoungFromWhenAge13 : SUCCESS");
        } else {
            System.out.println("shouldReturnYoungFromWhenAge13 : FAILED");
        }
    }

    void shouldReturnTeenWhenAge18() {
        AquaParkVisitorAgeClassifier victim = new AquaParkVisitorAgeClassifier();

        int age = 18;
        String expectedResult = "Teen";

        String actualResult = victim.classify(age);

        if (expectedResult.equals(actualResult)) {
            System.out.println("shouldReturnTeenWhenAge18 : SUCCESS");
        } else {
            System.out.println("shouldReturnTeenWhenAge18 : FAILED");
        }
    }

    void shouldReturnHappyWhenAge30() {
        AquaParkVisitorAgeClassifier victim = new AquaParkVisitorAgeClassifier();

        int age = 30;
        String expectedResult = "Happy";

        String actualResult = victim.classify(age);

        if (expectedResult.equals(actualResult)) {
            System.out.println("shouldReturnHappyWhenAge30 : SUCCESS");
        } else {
            System.out.println("shouldReturnHappyWhenAge30 : FAILED");
        }
    }

    void shouldReturnIncorrectAgeWhenAgeNegative() {
        AquaParkVisitorAgeClassifier victim = new AquaParkVisitorAgeClassifier();

        int age = -1;
        String expectedResult = "Incorrect age";

        String actualResult = victim.classify(age);

        if (expectedResult.equals(actualResult)) {
            System.out.println("shouldReturnIncorrectAgeWhenAgeNegative : SUCCESS");
        } else {
            System.out.println("shouldReturnIncorrectAgeWhenAgeNegative : FAILED");
        }
    }
    void shouldReturnJediWhenAge100() {
        AquaParkVisitorAgeClassifier victim = new AquaParkVisitorAgeClassifier();

        int age = 100;
        String expectedResult = "Jedi";

        String actualResult = victim.classify(age);

        if (expectedResult.equals(actualResult)) {
            System.out.println("shouldReturnJediWhenAge100 : SUCCESS");
        } else {
            System.out.println("shouldReturnJediWhenAge100 : FAILED");
        }
    }
}
