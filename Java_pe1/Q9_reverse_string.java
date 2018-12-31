//reverse the string
import java.util.Scanner;

public class Q9_reverse_string {
    public static void main(String a[]) {
        String s1 = "london";
        String s2 = "";
        for (int i=s1.length()-1;i>=0;i--){
            s2 += s1.charAt(i);
        }
        System.out.println(s2);
    }
}
