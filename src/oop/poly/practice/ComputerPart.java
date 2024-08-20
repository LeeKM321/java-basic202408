package oop.poly.practice;

public class ComputerPart {

    protected String partName;
    protected int partPrice;

    public ComputerPart(String partName, int partPrice) {
        this.partName = partName;
        this.partPrice = partPrice;
    }

    public void describePart() {
        System.out.println("Part: " + partName + ", Price: " + partPrice);
    }

}
