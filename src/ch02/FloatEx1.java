package ch02;

public class FloatEx1 {
    public static void main(String[] args) {
        float f = 9.12345678901234567890f;
        float f2 = 1.2345678901234567890f;
        float f3 = 12345678901234567890f;
        double d = 9.12345678901234567890d;

        System.out.printf("       12345678901234567890%n");
        System.out.printf("f:   %f%n", f); // 소수점 이하 6째자리까지 출력. 소수점 7자리에서 반올림.
        System.out.printf("f: %24.20f%n", f);
        System.out.printf("f2:%24.20f%n", f2);
        System.out.printf("f3:  %f%n", f3);
        System.out.printf("d: %24.20f%n", d);
    }
}
