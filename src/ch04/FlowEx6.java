package ch04;

import java.util.Scanner;

public class FlowEx6 {
    public static void main(String[] args){
        System.out.print("input the current Month: ");
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt(); // System.in을 통해 입력받은 숫자를 month에 저장.

        switch (month){
            case 3:
            case 4:
            case 5:
                System.out.println("this is Spring. not that Spring.");
                break;
            case 6: case 7: case 8:
                System.out.println("this is Summer");
                break;
            case 9: case 10: case 11:
                System.out.println("this is fall");
                break;
            default:
//            case 12: case 1: case 2:
                System.out.println("this is winter");
        } // end switch

    } // end main
}
