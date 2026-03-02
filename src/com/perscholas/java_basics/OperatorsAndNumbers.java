package com.perscholas.java_basics;

public class OperatorsAndNumbers {

    public static void main(String[] args) {

        // --- TASK 1: Left Shift (Multiplies by 2) ---
        // Shifting bits to the left adds a zero at the end.
        shiftLeft(2);
        shiftLeft(9);
        shiftLeft(17);
        shiftLeft(88);

        // --- TASK 2: Right Shift (Divides by 2 per shift) ---
        // Shifting right by 2 is the same as dividing by 2^2 (4).
        shiftRight(150);
        shiftRight(225);
        shiftRight(1555);
        shiftRight(32456);

        // --- TASK 3: Bitwise AND (&) ---
        int x_and = 7;  // Binary: 00111
        int y_and = 17; // Binary: 10001
        /* * Prediction:
         * 00111 & 10001 = 00001.
         * Decimal result should be 1.
         */
        int z_and = x_and & y_and;
        System.out.println("Bitwise AND (7 & 17): " + z_and + " (Binary: " + Integer.toBinaryString(z_and) + ")");

        // --- TASK 4: Bitwise OR (|) ---
        /* * Prediction:
         * 00111 | 10001 = 10111.
         * Decimal result: 16 + 4 + 2 + 1 = 23.
         */
        int z_or = x_and | y_and;
        System.out.println("Bitwise OR (7 | 17): " + z_or + " (Binary: " + Integer.toBinaryString(z_or) + ")");

        // --- TASK 5: Postfix Increment ---
        int myVal = 10;
        System.out.println("\nBefore postfix increment: " + myVal);
        myVal++;
        System.out.println("After postfix increment: " + myVal);

        // --- TASK 6: Three ways to increment ---
        int counter = 0;
        System.out.println("\nStarting counter: " + counter);

        counter = counter + 1; // Way 1
        System.out.println("Way 1 (c = c + 1): " + counter);

        counter++; // Way 2
        System.out.println("Way 2 (c++): " + counter);

        ++counter; // Way 3
        System.out.println("Way 3 (++c): " + counter);

        // --- TASK 7: Prefix vs Postfix in equations ---
        int valX = 5;
        int valY = 8;
        // Prefix: Increments valX TO 6, then adds 8.
        int sumPrefix = ++valX + valY;
        System.out.println("\nPrefix sum (++x + y): " + sumPrefix); // Should be 14

        valX = 5; // Reset
        // Postfix: Uses valX (5) to add to 8, THEN increments valX to 6.
        int sumPostfix = valX++ + valY;
        System.out.println("Postfix sum (x++ + y): " + sumPostfix); // Should be 13
    }

    // Helper method for Task 1
    public static void shiftLeft(int x) {
        System.out.println("Original: " + x + " Binary: " + Integer.toBinaryString(x));
        /* * Prediction:
         * Shifting left by 1 multiplies the number by 2.
         * For 2 -> 4 (100) | For 9 -> 18 (10010)
         * For 17 -> 34 (100010) | For 88 -> 176 (10110000)
         */
        x = x << 1;
        System.out.println("Left Shifted: " + x + " Binary: " + Integer.toBinaryString(x));
        System.out.println("---");
    }

    // Helper method for Task 2
    public static void shiftRight(int x) {
        System.out.println("Original: " + x + " Binary: " + Integer.toBinaryString(x));
        /* * Prediction:
         * Shifting right by 2 is integer division by 4.
         * For 150 -> 37 (100101) | For 225 -> 56 (111000)
         * For 1555 -> 388 (110000100) | For 32456 -> 8114 (1111110110010)
         */
        x = x >> 2;
        System.out.println("Right Shifted: " + x + " Binary: " + Integer.toBinaryString(x));
        System.out.println("---");
    }
}
