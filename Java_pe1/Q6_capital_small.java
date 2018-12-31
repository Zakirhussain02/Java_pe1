//if char is capital,small,number or symbols
import java.util.Scanner;

public class Q6_capital_small
{
    public static void main(String a[]) {
        Scanner chars = new Scanner(System.in);
        System.out.print("Enter the character: ");
        String charss = chars.nextLine();
        char c = charss.charAt(0);
        if (c > 64 && c < 91)
            System.out.println("Capital letter");
        else if (c > 96 && c < 123)
            System.out.println("small letter");
        else if (c > 47 && c < 58)
            System.out.println("Digits");
        else
            System.out.println("Special Characters");
    }
}
