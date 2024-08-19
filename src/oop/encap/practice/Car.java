package oop.encap.practice;

import java.time.LocalDate;

public class Car {

    private String brand;
    private String model;
    private int year;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year < 1900 || year > LocalDate.now().getYear()) {
            System.out.println("유효하지 않은 연식입니다.");
            return;
        }
        this.year = year;
    }
}














