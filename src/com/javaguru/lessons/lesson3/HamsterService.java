package com.javaguru.lessons.lesson3;

import java.util.Random;

class HamsterService {

    void changeHamsterColor(Hamster hamster) {
        String[] colors = {"Red", "Black", "White"};
        Random randomGenerator = new Random();
        int index = randomGenerator.nextInt(3);
        hamster.color = colors[index];
    }
}
