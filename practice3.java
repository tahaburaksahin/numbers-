//taha burak sahin
// Write a program which reads numbers until the user enters number 0 and then prints
//the maximum and minimum of the numbers that have been entered. Don’t use arrays,
//strings or collections
package task4;
import java.util.Scanner;
public class practice3 {
    public static void main(String[] args)
    {
        Scanner keyb = new Scanner(System.in);
        int n;

        System.out.println("Enter a sequence of positive integers, which will end with either 0 or a negative integer. ");
        int max = keyb.nextInt();
        int min = keyb.nextInt();
        {
            n = keyb.nextInt();
            if (n > max)
            {
                max = n;
            }
            if (n < min)
            {
                min = n;
            }
        }
        System.out.println("The maximum value is: " + max);
        System.out.println("The minimum value is: " + min);

    }
}

