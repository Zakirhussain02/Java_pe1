//vowels and consonents
import java.util.Scanner;

public class Q3_vowels{
    public static void main(String a[]) {
        Scanner number = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String x = number.next();
        for (int i = 0; i < x.length(); i++) {
            char z = x.charAt(i);
            if (z > 96 && z < 122) {
                if (z =='a' || z =='e' || z =='i' || z =='o' || z =='u')
                    System.out.print("vowel ");
                else
                    System.out.print("consnant");
            }
        }
    }
}