package ch03;

public class OperatorEx12 {
    public static void main(String args[]){
        char c1 = 'a'; // 97
        char c2 = c1; // 97
        char c3 = ' ';

        int i = c1 + 1; // 'a' + 1 = 98

        c3 = (char) (c1 + 1);
        c2++;
        c2++;

        System.out.printf("i = %d%n", i);
        System.out.printf("c2 = %c%n", c2);
        System.out.printf("c3 = %c%n", c3);
    }
}
