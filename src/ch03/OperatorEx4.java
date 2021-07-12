package ch03;

public class OperatorEx4 {
    public static void main(String[] args){
        int i = -10;
        i = +i; // do nothing.
        System.out.println(i);

        i = -10;
        i = -i; // 10
        System.out.println(i);

    }
}
