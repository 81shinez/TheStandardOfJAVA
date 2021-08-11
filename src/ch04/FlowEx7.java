package ch04;

import java.util.Scanner;

public class FlowEx7 {
    public static void main(String[] args){
        System.out.print("Scissors(1), Rock(2), Paper(3) >");

        Scanner scanner = new Scanner(System.in);
        int user = scanner.nextInt();
        int com = (int) (Math.random() * 3) + 1; // Math.random() returns double type value between 0 and 1

        System.out.println("your number is " + user);
        System.out.println("computer's number is " + com);

        switch (user - com){
            case 2: case -1:
                System.out.println("you lose");
                break;
            case 1: case -2:
                System.out.println("you win");
                break;
            case 0:
                System.out.println("draw");
//                break; // useless.
        }
    } // end main
}
