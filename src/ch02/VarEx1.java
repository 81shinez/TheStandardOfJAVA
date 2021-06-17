package ch02;

public class VarEx1 {
    public static void main(String[] args){
        // 변수의 선언과 초기화
        int year = 0;
        int age = 14;

        System.out.println(year);
        System.out.println(age);

        year = age + 2000; // 14 + 2000 = 2014
        age = age + 1; // 14 + 1 = 15

        System.out.println(year);
        System.out.println(age);
    }
}
