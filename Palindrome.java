import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s= scan.nextLine();
        String s1=s.toLowerCase();
        String rev = "";
        for(int i = s1.length()-1; i>=0; i--){
            rev = rev + s1.charAt(i);
        }
        System.out.println(s1.equals(rev) ? "palindrome": "not Palindrome");
    }
}
