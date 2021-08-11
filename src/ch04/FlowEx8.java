package ch04;

import java.util.Scanner;

public class FlowEx8 {
    public static void main(String[] args){
        System.out.print("당신의 주민번호 >");

        Scanner scanner = new Scanner(System.in);
        String regNo = scanner.nextLine();

        char gender = regNo.charAt(7);

        switch (gender){
            case '1': case '3':
                System.out.println("Male");
                break;
            case '2': case '4':
                System.out.println("Female");
                break;
            default:
                System.out.println("Unpredictable input");
        }
    }
}
