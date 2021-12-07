package baitap;

import java.util.Scanner;

public class SquareMatrix {

    public static void main(String[] args) {
	// write your code here
        int number ;
        int[][] matrix;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter square's long: ");
        number = scanner.nextInt();
        matrix = new int[number][number] ;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++){
                System.out.println("Enter element at row "+ i + " colum "+ j + ": ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[i].length; j++){
                if (i == j ){
                    sum += matrix[i][j] ;
                }
            }
        }
        System.out.println(sum);
    }
}
