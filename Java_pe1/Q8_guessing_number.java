//Guess the number between 1 and 50
import java.util.Scanner;

public class Q8_guessing_number{
    public static void main(String a[]) {
        Scanner number = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = number.nextInt();
        int predict = 10;
        if (num>1 && num <51) {
            if (num > predict)
                System.out.println("Number guessed is more than original number");
            else if (num < predict)
                System.out.println("Number guessed is less than original number");
            else
                System.out.println("Number guessed matches original number");
        }
        else
            System.out.println("Given number between 1 to 50");
    }
}

