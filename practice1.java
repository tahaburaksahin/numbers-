//taha burak sahin
//Write a program reading one real number (say, d) and the name of a geometrical
//figure
//• "disc" – d is then interpreted as the radius of a disc;
//• "triangle" – d is then interpreted as the side of a equilateral triangle;
//• "square" – d is then interpreted as the side of a square;
//• "rand" – the kind of figure is one of the above with equal probability (use
//Math.random(), which gives a number of type double in range [0, 1)) and d
//is interpreted as above.
package task4;
import java.util.Scanner;
public class practice1 {
    public static void main(String[] args) {
        Double d;
        System.out.println("d is side of square");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        d = sc.nextDouble();

        Double square = d * d;
        System.out.println("Square of " + d + " is: " + square);
    }
}

