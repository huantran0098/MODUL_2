package baitap.QuadraticEquation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number a:");
        double a = scanner.nextDouble() ;
        System.out.println("Enter number b:");
        double b = scanner.nextDouble();
        System.out.println("Enter number c:");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c) ;
        if (quadraticEquation.getDiscriminant() < 0){
            System.out.println("Phương trình vô nghiệm!");
        } else if (quadraticEquation.getDiscriminant() == 0 ){
            System.out.println("Phương trình có nghiệm kép: x = " + quadraticEquation.getRoot());
        } else {
            System.out.println("Phương trình có hai nghiệm phân biệt: x1 = " + quadraticEquation.getRoot1() + ", x2 = " + quadraticEquation.getRoot2());
        }
    }
}
