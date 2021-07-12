package ch03;

public class OperatorEx11 {
    public static void main(String[] args){
        char a = 'a';
        char d = 'd';
        char zero = '0';
        char two = '2';

        System.out.printf("'%c' - '%c' = %d%n", d, a, d - a);
        System.out.printf("'%c' - '%c' = %d%n", two, zero, two - zero);
        System.out.printf("'%c' = %d%n", a, (int)a);
        System.out.printf("'%c' = %d%n", d, (int)d);
        System.out.printf("'%c' = %d%n", zero, (int)zero);
        System.out.printf("'%c' = %d%n", two, (int)two);

        //문자는 부호없는 정수인 유니코드로 저장되므로 정수간 연산이 가능하다.
    }
}
