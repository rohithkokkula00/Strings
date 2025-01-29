public class StringOperations {
    public static void main(String[] args) {
        String str = "Hello, World!";

        System.out.println("Original String: " + str);
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Length: " + str.length());
        System.out.println("Replaced 'o' with 'a': " + str.replace('o', 'a'));
        System.out.println("Substring (7 to end): " + str.substring(7));
    }
}
