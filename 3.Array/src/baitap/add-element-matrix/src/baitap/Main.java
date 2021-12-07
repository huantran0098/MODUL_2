package baitap;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int number, col, row ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vị trí của hàng muốn thêm: ");
        row = scanner.nextInt();
        System.out.println("Nhập vị trí của số muốn thêm: ");
        col = scanner.nextInt();
        System.out.println("Nhập số muốn thêm vào: ");
        number = scanner.nextInt();

	// write your code here
        int[][] matrix = {{1,2,3,0}, {4,5,6,0}, {7,8,9,0}};
        int[][] newMatrix = new int[matrix.length][matrix.length + 1] ;
    addElementMatrix(matrix, newMatrix, number, row,col);
    }

    public static void addElementMatrix(int[][] matrix, int[][] newMatrix, int number, int row, int col){
        for (int i = 0; i < row - 1 ; i++) {
            for (int j = 0; j < newMatrix[i].length; j++) {
                newMatrix[i][j] = matrix[i][j] ;
            }
        }
        for (int i = newMatrix.length; i > row ; i--) {
            for (int j = 0; j < matrix[i].length ; j++) {
                newMatrix[i][j] = matrix[i][j] ;
            }
        }
        
    newMatrix[row][col] = number ;
        System.out.println("New matrix's element is: " + Arrays.toString(newMatrix[row]));
    }
}
