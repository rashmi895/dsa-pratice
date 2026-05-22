import java.util.*;

public class SumOfDigits {
    public static void main(String[] args) {
        int sum = 0;  
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int digit = sc.nextInt();  // input number

        while (digit > 0) {
            int last = digit % 10;   // extract last digit
            sum = sum + last;        // add to sum
            digit = digit / 10;      // remove last digit
        }

        System.out.println("Sum of digits = " + sum);

        sc.close(); // good practice
    }
}
