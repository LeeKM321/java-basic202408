package oop.static_.practice;

public class Store {

    private static int totalSales;

    public static void addSale(int amount) {
        totalSales += amount;
    }

    public static int getTotalSales() {
        return totalSales;
    }

}
