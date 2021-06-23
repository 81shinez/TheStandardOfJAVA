public class TestClass {
    public static void main(String[] args){
        //오버플로우
        byte a = Byte.MAX_VALUE; // 01111111
        System.out.println(a);
        a++; // 10000000
        System.out.println(a);

    }
}
