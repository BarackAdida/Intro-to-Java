public class StringOperations{
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Nelson";
        String str3 = "You are " + str2;

        System.out.println("Welcome:" + str3);
        System.out.println(str2.length());
        System.out.println(str3.toUpperCase());
        System.out.println(str1.substring(4));
    }
}