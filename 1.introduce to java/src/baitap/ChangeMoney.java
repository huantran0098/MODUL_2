package baitap;
import java.util.Scanner;

public class ChangeMoney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int usd ;
        System.out.println("Enter usd to change: ");
        usd = scanner.nextInt() ;
        int vnd ;
        vnd = usd * 23000 ;
        System.out.println("Change " + usd + " USD to VND is: " + vnd);
    }
}
