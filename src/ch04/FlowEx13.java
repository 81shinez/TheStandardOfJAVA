package ch04;

import java.util.Scanner;

public class FlowEx13 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int num = scanner.nextInt();

        for(int i=1; i<=num; i++){
            sum += i;
            System.out.printf("1부터 %2d 까지의 합: %d%n", i, sum);
        }
    } // end main
}
