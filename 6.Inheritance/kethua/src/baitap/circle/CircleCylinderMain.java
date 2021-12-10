package baitap.circle;

import java.util.Scanner;

public class CircleCylinderMain {
    public static void main(String[] args) {
        MyCircle circle = new MyCircle();
        Cylinder cylinder = new Cylinder();
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào bán kính Circle:");
        double radius = scanner.nextDouble();

        System.out.println("nhập vào bán kính Cylinder:");
        double radiusCylinder = scanner.nextDouble();

        circle.setRadius(radius);
        circle.setColor("yellow");

        cylinder.setRadius(radiusCylinder);
        cylinder.setColor("black");
        cylinder.setHeight(10.0);
//        System.out.println(circle.toString());
//        System.out.println(cylinder.toString());
        System.out.println(circle.getArea());
        System.out.println(cylinder.getVolume());
    }
}
