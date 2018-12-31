//loop of numbers

import java.util.Scanner;

public class Q4_loop_number {
    public static void main(String a[]) {
        Scanner number = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = number.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
        }
    }
}
