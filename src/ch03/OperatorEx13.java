package ch03;

public class OperatorEx13 {
    public static void main(String args[]){
        char c1 = 'a';

//        char c2 = c1 + 1; // '+'연산의 결과는 int형이므로 char형 변수에 담을 수 없다.
        char c2 = 'a' + 1; // 변수가 아닌 리터럴 간의 연산은 컴파일시 컴파일러가 미리 계산하여 오류가 없다.

        System.out.println(c2);
    }
}
