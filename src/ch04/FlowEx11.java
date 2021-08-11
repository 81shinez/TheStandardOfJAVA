package ch04;

import java.util.Scanner;

public class FlowEx11 {
    public static void main(String[] args){
        System.out.print("당신의 주민번호 >");

        Scanner scanner = new Scanner(System.in);
        String regNo = scanner.nextLine();

        char gender = regNo.charAt(7);

        switch (gender){
            case '1': case '3':
                switch (gender){
                    case '1':
                        System.out.println("you are a man who were born before 2000");
                        break;
                    case '3':
                        System.out.println("you are a man who were born after 2000");
                }
                break;
            case '2': case '4':
                switch (gender){
                    case '2':
                        System.out.println("you are a woman who were born before 2000");
                        break;
                    case '4':
                        System.out.println("you are a woman who were born after 2000");
                }
                break;
            default:
                System.out.println("Unpredictable input");
        }
    }
}
