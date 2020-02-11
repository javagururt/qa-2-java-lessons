package com.javaguru.lessons.lesson4;

class Stock {

    String name;
    double minPrice;
    double maxPrice;

    public Stock(String name, double price) {
        this.name = name;
        minPrice = price;
        maxPrice = price;
    }

    void printInformation() {
        System.out.println("Name: " + name);
        System.out.println("Max price: " + maxPrice);
        System.out.println("Min price: " + minPrice);
    }

    void updatePrice(double newPrice) {
        if (newPrice < minPrice) {
            minPrice = newPrice;
        } else if (newPrice > maxPrice) {
            maxPrice = newPrice;
        }
    }
}
