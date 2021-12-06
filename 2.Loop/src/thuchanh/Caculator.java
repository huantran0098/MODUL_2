package thuchanh;

import java.util.Scanner;

public class Caculator {
    public static void main(String[] args) {
        double money = 1.0 ;
        int month = 1 ;
        double rate = 1.0 ;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter money: ");
        money = input.nextDouble();
        System.out.println("Enter month: ");
        month = input.nextInt();
        System.out.println("Enter rate: ");
        rate = input.nextDouble();
        double total = 0.0;
        for ( int i = 0 ; i < month ; i++ ){
            total += money * (rate/100)/12 * month ;
        }
        System.out.println("The total is: " + total );
    }
}
