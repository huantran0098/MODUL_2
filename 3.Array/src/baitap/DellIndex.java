package baitap;

import java.util.Arrays;
import java.util.Scanner;

public class DellIndex {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};

        int number, index ;
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Enter number to remove");
        number = scanner.nextInt() ;
boolean check = false;
        for ( int i = 0; i < array.length; i++ ) {
            if ( number == array[i] ) {
                index = i + 1 ;
                System.out.println("Number's position is: " + index);

                while ( number == array[i]){
                    System.arraycopy(array, i + 1, array, i, array.length - i - 1);
                    array[array.length - 1] = 0 ;
                }
                System.out.println("New array is: " + Arrays.toString(array));
                check = true;
                break;
            }
        }
        if(!check){
            System.out.println("Number is not in array");
        }
    }
}
