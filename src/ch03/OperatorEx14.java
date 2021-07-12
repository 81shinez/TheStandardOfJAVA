package ch03;

public class OperatorEx14 {
    public static void main(String args[]){
        char c = 'a';

        for(int i=0; i < 26; i++){ // abcdefghijklmnopqrstuvwxyz
            System.out.print(c++);
        }
        System.out.println(); // 줄바꿈

        c = 'A';
        for(int i=0; i < 26; i++){ // ABCDEFGHIJKLMNOPQRSTUVWXYZ
            System.out.print(c++);
        }
        System.out.println(); // 줄바꿈

        c = '0';
        for(int i=0; i < 10; i++){ // 0123456789
            System.out.print(c++);
        }
    }
}
