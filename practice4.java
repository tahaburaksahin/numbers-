//taha burak sahin
//Write a program printing all divisors of a natural number (greater than 1) entered by
//the user — including 1 and the number itself

package task4;
public class practice4 {
    static void printDivisors(int n)
    {
        for (int i=1;i<=n;i++)
            if (n%i==0)
                System.out.print(i+" ");
    }

    public static void main(String args[])
    {
        System.out.println("The divisors of 100 are: ");
        printDivisors(100);;
    }
}
