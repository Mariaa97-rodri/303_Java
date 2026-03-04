package PA_303_5_1;

import java.util.Scanner;

public class GCD {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n1: ");
        int n1 = sc.nextInt();
        System.out.print("Enter n2: ");
        int n2 = sc.nextInt();


        int gcd = 1; //1 is always a common divisor

        //Check every k from 2 up to the smaller of the two numbers
        for(int k = 2; k <= n1 && k <= n2; k++) {
            if (n1 % k == 0 && n2 % k == 0) {
                gcd = k; //Update gcd if k divides both
            }
        }
        System.out.println("The gcd is " + gcd);
    }
}
