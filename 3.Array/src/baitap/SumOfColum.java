package baitap;

import java.util.Scanner;

public class SumOfColum {
    public static void main(String[] args) {
        int row, col;
        int number;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        int[][] arr ;
        System.out.println("Enter row of array");
        row = scanner.nextInt();
        System.out.println("Enter colum of array");
        col = scanner.nextInt();
        arr = new int[row][col];
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.println("Enter element at row "+ i + " colum " + j + ": " );
                arr[i][j] = scanner.nextInt();
            }
        }
            System.out.println("Enter colum you want to know Sum: ");
            number = scanner.nextInt();
        for (int i = 0; i < arr.length; i++){
            sum += arr[i][number];
        }
        System.out.println("Sum of element in colum " + number + " is: " + sum );
    }
}
