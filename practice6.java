//taha burak sahin
//Write a program which reads integers from the user until he/she enters 0 (which
//merely signals end of input is not taken in further considerations). Then the program
//prints the information whether in this series of numbers there were two consecutive
//equal ones.

package task4;
import java.util.Scanner;
public class practice6 {
    public static void main(String[] args) {

        int counter = 0;
        double even = 0;
        double odd = 0;
        double sum = 0;
        int input = 0;
        int large = 0;
        int small = 0;
        double average;

        System.out.print("Enter a series of values (0 to quit): ");
        Scanner in = new Scanner(System.in);

        while ((input = in.nextInt()) != 0) {

            small = in.nextInt();
            large = in.nextInt();

            if (input != 0)
                sum = input + sum;
            counter++;

            if (input > large)
                large = input;

            if (input < small)
                small = input;

            if (input % 2 == 0)
                even = even + 1;
            else
                odd = odd + 1;

        }

        if (counter > 0) {

            average = sum / counter;

            System.out.println("The smallest integer is: " + small);
            System.out.println("The largest integer is: " + large);
            System.out.println("Total number of integers entered is " + counter);
            System.out.println("Total even numbers entered is " + even);
            System.out.println("Total odd numbers entered is " + odd);
            System.out.println("The average value is: " + average);
        } else {

            System.out.println("No data was entered.");
        }
    }
}

