package recursion;

public class Example07 {
    public static void main(String[] args) {
        char s[]={'h','e','l'};
        reverseString(s);
        System.out.println(s);
    }
    public static void reverseString(char[] s) {
        char s1[]=new char[s.length];
        for(int i=0;i<s.length;i++){
            s1[i]=s[s.length-i-1];
        }
        for(int i=0;i<s.length;i++){
            s[i]=s1[i];
        }
        System.out.println(s);

    }
}
