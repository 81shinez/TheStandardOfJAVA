package ch03;

public class OperatorEx23 {
    public static void main(String[] args){
        String str1 = "abc";
        String str2 = new String("abc");
        String str3 = "abc";

        System.out.printf("\"abc\" == \"abc\" ? %b%n", "abc" == "abc");
        System.out.printf("str1 == \"abc\" ? %b%n", str1 == "abc");
        System.out.printf("str2 == \"abc\" ? %b%n", str2 == "abc");
        System.out.printf("str1.equals(\"abc\") ? %b%n", str1.equals("abc"));
        System.out.printf("str2.equals(\"abc\") ? %b%n", str2.equals("abc"));
        System.out.printf("str2.equals(\"ABC\") ? %b%n", str2.equals("ABC"));
        System.out.printf("str2.equalsIgnoreCase(\"ABC\") ? %b%n", str2.equalsIgnoreCase("abc"));

        System.out.println("\"abc\".hashCode(): " + "abc".hashCode());
        System.out.println("str1.hashCode(): " + str1.hashCode());
        System.out.println("str2.hashCode(): " + str2.hashCode());
        System.out.println("System.identityHashCode(str1): " + System.identityHashCode(str1));
        System.out.println("System.identityHashCode(str2): " + System.identityHashCode(str2));
        System.out.println("System.identityHashCode(str3): " + System.identityHashCode(str3));
        System.out.printf("str1 == str2 ? %b%n", str1 == str2);
        System.out.printf("str1 == str3 ? %b%n", str1 == str3);

        int integer1 = 1;
        int integer2 = 1;
        System.out.println("System.identityHashCode(integer1): " + System.identityHashCode(integer1));
        System.out.println("System.identityHashCode(integer2): " + System.identityHashCode(integer2));
    }
}
