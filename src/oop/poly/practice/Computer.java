package oop.poly.practice;

import java.util.Arrays;

public class Computer {

    private ComputerPart[] parts;

    public Computer() {
        // 객체가 생성될 때 크기가 0인 배열이 생성.
        this.parts = new ComputerPart[0];
    }

    public void addPart(ComputerPart part) {
        // ComputerPart[] 에 부품 추가
        ComputerPart[] temp = new ComputerPart[parts.length + 1];
        for (int i = 0; i < parts.length; i++) {
            temp[i] = parts[i];
        }
        temp[temp.length-1] = part;
        parts = temp;
    }

    public void showParts() {
        // 모든 부품 정보 출력
//        System.out.println(Arrays.toString(parts));
        for (ComputerPart part : parts) {
            part.describePart();
        }
    }

}











