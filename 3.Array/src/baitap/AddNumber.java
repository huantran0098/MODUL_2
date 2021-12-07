package baitap;

import java.util.Arrays;
import java.util.Scanner;

public class AddNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10} ;
        int number, index ;
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Enter position to add number.");
        index = scanner.nextInt();
        System.out.println("Enter number to add.");
        number = scanner.nextInt();

        if (index <= -1 && index >= arr.length - 1){
            System.out.println("Không chèn được đâu bạn ơi, té đi nhập lại!!");
        }else {
        for (int i = 0; i < index -1; i++){
            arr[i] = arr[i];
        }
        for (int i = arr.length; i > index -1; i--) {
            arr[i] = arr[i-1] ;
        }
        arr[arr.length -1 ] = arr[arr.length -1];
        arr[index -1] = number;
            System.out.println("New array is: " + Arrays.toString(arr));
        }
    }
}
