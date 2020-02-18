package com.javaguru.lessons.lesson3;

class HamsterServiceTest {

    public static void main(String[] args) {
        Hamster firstHamster = new Hamster();
        firstHamster.age = 1;
        firstHamster.name = "Tolik";
        firstHamster.weight = 100.0;
        firstHamster.color = "Ginger";

        HamsterService service = new HamsterService();
        service.changeHamsterColor(firstHamster);

        System.out.println(firstHamster.color);
        firstHamster.color = "Ginger";
        System.out.println(firstHamster.color);
    }
}
