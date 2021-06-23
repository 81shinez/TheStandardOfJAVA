package ch02;

public class CharToCode {
    public static void main(String[] args){
        char ch = 'A';
        int code = (int) ch;

        System.out.printf("%c = %d (%#X)%n", ch, code, code); // A = 65 (0X41)

        char hch = '가';
        hch = '\uAC00'; // 유니코드 직접 사용
        System.out.printf("%c = %d (%#X)%n", hch, (int)hch, (int)hch); // 가 = 44032 (0XAC00)
    }
}
