package ch03;

public class OperatorEx3 {
    public static void main(String[] args){
        int i = 5;
        int j = 5;

        System.out.println(i++); // 5
        System.out.println(++j); // 6
        System.out.printf("i = %d, j = %d", i, j); // 6, 6
    }
}