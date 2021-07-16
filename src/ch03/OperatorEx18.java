package ch03;

public class OperatorEx18 {
    public static void main(String[] args){
        double pi = 3.141592;
        double shortPi = Math.round(pi * 1000) / 1000d;
        System.out.println(shortPi); // 3.142
    }
}
