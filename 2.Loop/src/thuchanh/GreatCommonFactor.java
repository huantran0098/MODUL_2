package thuchanh;

import java.util.Scanner;

public class GreatCommonFactor {
    public static void main(String[] args) {
        int a , b ;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numA");
        a = input.nextInt();
        System.out.println("Enter numB");
        b = input.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if ( a == 0 || b == 0 ){
            System.out.println("No great common factor");
        }
        while ( a != b ){
            if ( a > b ){
                a = a - b;
                System.out.println("The great common factor is: " + a );
                break;
            }
            else{
                b = b - a;
                System.out.println("The great common factor is: " + b );
                break;
            }
        }

    }
}
