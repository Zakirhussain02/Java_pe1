//palindrome or not
import java.util.Scanner;
public class Q1_palindrome {
    public static void main(String a[]) {
        long sums=0;
        Scanner number = new Scanner(System.in);
        System.out.println("Enter number to check: ");
        long num = number.nextLong();
        long nums = num;
        //System.out.println(nums);
        long reversed = 0;
        while (num != 0) {
            long digit = num % 10;
            if(digit % 2 == 0)
                sums += digit;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        //System.out.println(nums+" "+reversed + " "+ sums);
        if (nums == reversed && sums > 25)
        System.out.println(nums+" is palindrome and the sum of even numbers is greater than 25");
        else if (nums == reversed)
            System.out.println(nums+" is palindrome and the sum of even numbers is less than 25");
            System.out.println(nums+" is not palindrome");
    }
}

