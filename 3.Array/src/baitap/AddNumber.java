package baitap;

import java.util.Arrays;
import java.util.Scanner;

public class AddNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10} ;
        int[] array = new int[arr.length + 1] ;
        int number, index ;
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Enter position to add number.");
        index = scanner.nextInt();
        System.out.println("Enter number to add.");
        number = scanner.nextInt();
        addElement(arr, array, number, index);
    }

    public static void addElement ( int[] arr, int[] array , int number, int index ){
        for (int i = 0; i < index -1; i++) {
            array[i] = arr[i] ;
        }
        for (int i = arr.length; i > index - 1; i--) {
            array[i] = arr[i - 1] ;
        }
        array[index - 1] = number ;
        System.out.println("New array is: " + Arrays.toString(array));
    }
}
