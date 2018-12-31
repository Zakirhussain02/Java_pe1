//tom and jerry
import java.util.Scanner;
public class Q2_tom {
    public static void main(String a[]) {
        Scanner number = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = number.nextInt();
        if (num > 20 && num < 30)
            if (num % 2 != 1) {
                System.out.println("Jerry");
            } else {
                System.out.println("Tom");
            }
    }
}

