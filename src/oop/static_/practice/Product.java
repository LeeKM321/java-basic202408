package oop.static_.practice;

public class Product {

    private String productName;
    private int price;

    public Product(String productName, int price) {
        this.productName = productName;
        this.price = price;
    }

    public void sellProduct() {
        Store.addSale(this.price);
    }

}














