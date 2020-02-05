package com.javaguru.lessons.lesson3;

class HamsterTest {

    public static void main(String[] args) {
        Hamster firstHamster = new Hamster();
        firstHamster.age = 1;
        firstHamster.name = "Tolik";
        firstHamster.weight = 100.0;
        firstHamster.color = "Ginger";

        System.out.println("Hamster age = " + firstHamster.age);
        System.out.println("Hamster name = " + firstHamster.name);
        System.out.println("Hamster weight = " + firstHamster.weight);
        System.out.println("Hamster color = " + firstHamster.color);

        System.out.println();

        firstHamster.eat(50.0);
        System.out.println("Hamster weight = " + firstHamster.weight);
        System.out.println();

        firstHamster.eat(150.0);
        firstHamster.eat(100);
        firstHamster.eat(3);

        System.out.println("Hamster weight = " + firstHamster.weight);
    }
}
