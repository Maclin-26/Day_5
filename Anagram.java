import java.util.Arrays;
import java.util.Scanner;
public class Anagram {
    public static boolean anagram(String a, String b) {
        if (a.length() != b.length()) return false;
        char[] char1 = a.toLowerCase().toCharArray();
        char[] char2 = b.toLowerCase().toCharArray();
        Arrays.sort(char1);
        Arrays.sort(char2);
        return Arrays.equals(char1, char2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String a = sc.nextLine();
        System.out.println("Enter second string: ");
        String b= sc.nextLine();
        if (anagram(a, b)) {
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not Anagram");
        }
    }
}