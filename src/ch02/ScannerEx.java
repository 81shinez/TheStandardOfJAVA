package ch02;

import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("input an integer: ");
        String input = scanner.nextLine();
        int num = Integer.parseInt(input);

        System.out.printf("입력내용: %s%n", input);
        System.out.printf("num = %d%n", num);
    }
}
