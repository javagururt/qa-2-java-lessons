package com.javaguru.lessons.lesson4;

class StockTest {

    public static void main(String[] args) {
        Stock stock = new Stock("IBM", 100);
        stock.printInformation();
        double newPrice = 130;
        stock.updatePrice(newPrice);
        stock.printInformation();
        stock.updatePrice(80);
        stock.updatePrice(140);
        stock.updatePrice(120);
        stock.printInformation();
    }
}
