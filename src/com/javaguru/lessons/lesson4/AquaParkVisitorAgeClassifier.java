package com.javaguru.lessons.lesson4;

class AquaParkVisitorAgeClassifier {

    public String classify(int age) {
        if (age < 1) {
            return "Incorrect age";
        }
        if (age <= 7) {
            return "Tadpole";
        }
        if (age <= 13) {
            return "Young frog";
        }
        if (age <= 18) {
            return "Teen";
        }
        if (age <= 30) {
            return "Happy";
        }
        if (age <= 65) {
            return "Adult";
        }
        if (age <= 80) {
            return "Senior";
        }
        return "Jedi";
    }
}
