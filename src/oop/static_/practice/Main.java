package oop.static_.practice;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("노트북", 1000000);
        Product product2 = new Product("스마트폰", 500000);

        product1.sellProduct();
        product2.sellProduct();

        System.out.println("총 판매액: " + Store.getTotalSales());

    }
}
