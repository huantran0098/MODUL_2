package baitap;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    int size1,size2;
        System.out.print("Enter size1");
        size1 = scanner.nextInt();
        int[] arr1 = new int[size1] ;
        for (int i = 0; i < arr1.length; i++){
            System.out.println("Enter element of arr1: ");
            arr1[i] = scanner.nextInt();
        }
        System.out.print("Enter size2");
        size2 = scanner.nextInt();
        int[] arr2 = new int[size2] ;
        for(int j = 0; j < arr2.length; j++){
            System.out.println("Enter element of arr2: ");
            arr2[j] = scanner.nextInt();
        }

        int[] arr3 = new int[size1 + size2] ;
        for (int i= 0; i< arr1.length; i++){
            arr3[i] = arr1[i] ;
        }
        for (int i = 0; i < arr2.length; i++){
            arr3[i + arr1.length] = arr2[i] ;
        }
        System.out.println("new Array = " + Arrays.toString(arr3));
    }
}