package com.wipro.java.ms.lsv;

public class Test {
    static void getAreaTest(Shape shape) {
        System.out.println("Area: " + shape.getArea());
    }

    public static void main(String[] args) {
        Rectangle rc = new Rectangle(2, 3);
        rc.setHeight(10);
        getAreaTest(rc);  // Expected: 2 * 10 = 20

        Square sq = new Square(5);
        getAreaTest(sq);  // Expected: 5 * 5 = 25
    }
}