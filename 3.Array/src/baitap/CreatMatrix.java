package baitap;

import java.util.Scanner;

public class CreatMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row, col ;
        System.out.println("Enter row of matrix");
        row = input.nextInt();
        System.out.println("Enter colum of matrix");
        col = input.nextInt();

        int[][] matrix = new int[row][col] ;
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col ; j++){
                System.out.println("Enter element at row" + i + "colum"+ j +": ");
                matrix[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col ; j++){
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println("\n");
        }
        int max = 0;
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col ; j++){
                if (matrix[i][j] > max ){
                    max = matrix[i][j];

                }
            }
        }
        System.out.println("Max of matrix is: "+ max);
    }
}
