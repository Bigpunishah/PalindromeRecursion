import java.util.Scanner;
import java.util.Vector;

class PalindromeString {
    Vector<String> v = new Vector<>(10);
    Scanner sc = new Scanner(System.in);

    public void inputStringVector() {
        while (v.size() != v.capacity()) {
            v.add(sc.nextLine());
            inputStringVector(); // recursive function
        }
    }

    public void isPalindrome() {
        for (int i = 0; i < v.size(); i++) {
            String str = v.get(i);
            String rev = "";
            for (int j = str.length() - 1; j >= 0; j--) {
                rev = rev + str.charAt(j);
            }
            if (str.equals(rev)) {
                System.out.println(str + " = " + rev);
            } else {
                System.out.println(str + " != " + rev);
            }
        }
    }
}

public class Palindrome {
    public static void main(String[] args) {
        PalindromeString s = new PalindromeString();
        System.out.println("Enter 10 strings to determine if they are Palindrome:\t");
        s.inputStringVector();
        s.isPalindrome();
    }
}