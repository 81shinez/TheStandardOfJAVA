package ch02;

public class StringEx1 {
    public static void main(String[] args){
        String name = "ja" + "va";
        String str = name + 8.0;

        System.out.println(name); // java
        System.out.println(str); // java8.0

        System.out.println(7+7+"7"); // "147"
        System.out.println(7+"7"+7+7); // "7777"
    }
}
