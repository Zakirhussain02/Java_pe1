//looping the string from back

import java.util.*;
//import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Q10_loopoing {
    public static void main(String[] args) throws IOException{
        //for reading string
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));

        //for reading integer
        Scanner input_2 = new Scanner(System.in);
        System.out.println("enter the string ");
        System.out.println("enter the number ");
        String input_1 = reader.readLine();
        int num =input_2.nextInt();
        System.out.print(input_1);
        for (int i=0;i<num;i++){
            for(int j=input_1.length()-num;j<input_1.length();j++){
                System.out.print(input_1.charAt(j));
            }
        }
    }
}
