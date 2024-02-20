import java.util.Scanner;
import java.util.Vector;

class PalindromeString {
    Vector<String> v = new Vector<>(10); // 
    Scanner sc = new Scanner(System.in);

    public void inputStringVector() {
        if (v.size() != v.capacity()) {
            String input = sc.nextLine();
            v.add(input);
            inputStringVector(); // Recursion
        }
    }

    private int counter = 0;

    public void isPalindrome() {
        if (counter != v.size()) {
            String str = v.get(counter);
            String rev = "";
            for (int j = str.length() - 1; j >= 0; j--) {
                rev = rev + str.charAt(j);
            }
            if (str.equals(rev)) {
                System.out.println(str + " = " + rev);
            } else {
                System.out.println(str + " != " + rev);
            }
            counter++;
            isPalindrome(); // Recursion
        }
    }
}

public class Project8 {
    public static void main(String[] args) {
        PalindromeString s = new PalindromeString();
        System.out.print("Enter 10 strings to determine if they are Palindrome:\t");
        s.inputStringVector();
        System.out.println("\n~~Results!~~\n");
        s.isPalindrome();
    }
}