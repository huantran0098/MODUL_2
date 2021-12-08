package baitap;

import java.util.Scanner;

public class FindText {

    public static void main(String[] args) {
        String str;
        char text;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập vào 1 chuỗi bất kỳ: ");
            str = scanner.nextLine();
        } while (str.length() > 10);

        System.out.println("Nhập vào ký tự cần đếm số lần xuất hiện: ");
        text = scanner.next().charAt(0);

        for (int i = 0; i < str.length(); i++) {
            if (text == str.charAt(i)) {
                count++;
            }
        }

        System.out.println("Số lần xuất hiện của ký tự " + text +
                " trong chuỗi " + str + " = " + count);
    }
}
