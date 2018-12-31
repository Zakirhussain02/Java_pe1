//read unspecified number and sum
import java.util.Scanner;

public class Q5_input_sum {
        public static void main(String a[]) {
            Scanner number = new Scanner(System.in);
            System.out.print("Enter the number: ");
            int sum = 0;
            //enters if input is num
            while(number.hasNextInt()) {
                System.out.print("Enter the number: ");
                sum += number.nextInt();
            }
            //prints out when input is char
            System.out.println(sum);
            }
        }