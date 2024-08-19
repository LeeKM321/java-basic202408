package oop.inherit.product;

public class Television extends ElectronicProduct {

    int screenSize;

    public Television(String productName, double price, String manufacturer, int screenSize) {
        super(productName, price, manufacturer);
        this.screenSize = screenSize;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.printf("Screen Size: %d inches\n", this.screenSize);
    }
}
