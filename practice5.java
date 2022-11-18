// taha burak sahin
//Write a program which reads positive integers from the user until he/she enters 0
//which merely signals end of input is not taken in further considerations.
package task4;
public class practice5
{ static int remainderWith7(String num) {
        int series[] = {1, 3, 2, -1, -3, -2};

        int series_index = 0;

        int result = 0;

        for (int i = num.length() - 1; i >= 0; i--) {
            int digit = num.charAt(i) - '0';

            result += digit * series[series_index];

            series_index = (series_index + 1) % 6;

            result %= 7;
        }

        if (result < 0)
            result = (result + 7) % 7;

        return result;
    }

    public static void main(String[] args) {
        String str = "12345";
        System.out.print("Remainder with 7 is "
                + remainderWith7(str));
    }
}
