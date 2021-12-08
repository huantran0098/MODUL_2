package thuchanh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the width");
        double width = scanner.nextDouble();
        System.out.println("Enter the height");
        double height = scanner.nextDouble();
        Rectangle rect = new Rectangle(width, height) ;
        System.out.println("your rectangle\n " + rect.display() );
        System.out.println("Perimeter of rectangle: " + rect.getPerimeter());
        System.out.println("Area of rectangle: " + rect.getArea());
    }
}
