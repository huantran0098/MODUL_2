package baitap;

import java.util.Scanner;

public class FindMin {
    public static void main(String[] args) {
        int row, col ;
        int[][] arr ;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter row of array");
        row = input.nextInt();
        System.out.println("Enter colum of array");
        col = input.nextInt();
        arr = new int[row][col];
        int min = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++){
                System.out.println("Enter element at row" + i + "colum " + j + ": ");
                arr[i][j] = input.nextInt();

            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++){
                if (arr[i][j] < min ){
                    min = arr[i][j];
                }
            }
        }
        System.out.println("Min of matrix is: "+ min);
    }
}
