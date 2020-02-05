package com.javaguru.lessons.lesson3;

class Hamster {

    String name;
    double weight;
    int age;
    String color;

    void eat(double foodWeight) {
        System.out.println("om-nom-nom");
        weight = weight + foodWeight;
//        weight += foodWeight;
    }
}
