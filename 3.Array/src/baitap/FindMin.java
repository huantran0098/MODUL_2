package baitap;

import java.util.Scanner;

public class FindMin {
    public static void main(String[] args) {
        int size ;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of array");
        size = input.nextInt();
        int[] arr = new int[size];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++ {
            for (int j = 0; j < arr.length; j++){
                System.out.println("Enter element at row" + i + "colum " + j + ": ");
                arr[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++ {
            for (int j = 0; j < arr.length; j++){
                if (arr[i][j] < min ){
                    min = arr[i][j] ;
                }
            }
        }
        System.out.println("Min of matrix is: "+ min);
    }
}
