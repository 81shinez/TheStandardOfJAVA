package ch03;

public class OperatorEx9 {
    public static void main(String[] args){
        long a = 1_000_000 * 1_000_000;
        long b = 1_000_000 * 1_000_000l;

        System.out.printf("a = %d%n", a); // -727379968
        System.out.printf("b = %d%n", b); // 1000000000000
    }
}
