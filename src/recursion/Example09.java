package recursion;

public class Example09 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("mom"));
    }
    public static boolean isPalindrome(String s) {
        String clean = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();

        String reversed = new StringBuilder(clean).reverse().toString();

        return clean.equals(reversed);
    }
}
