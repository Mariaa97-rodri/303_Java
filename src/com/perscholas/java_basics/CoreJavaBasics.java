package com.perscholas.java_basics;

public class CoreJavaBasics {
    public static void main(String[] args) {

        // 1. Two integers, add them, print the sum
        int num1 = 10;
        int num2 = 20;
        int sumInt = num1 + num2;
        System.out.println("1. Sum of ints: " + sumInt);

        // 2. Two doubles, add them, print the sum
        double dbl1 = 5.5;
        double dbl2 = 4.5;
        double sumDbl = dbl1 + dbl2;
        System.out.println("2. Sum of doubles: " + sumDbl);

        // 3. One int, one double, add them.
        // Answer: The variable type must be a double, because adding an int to a
        // double results in a double (Java promotes the int).
        int i3 = 10;
        double d3 = 5.5;
        double sumMix = i3 + d3;
        System.out.println("3. Mixed sum (int + double): " + sumMix);

        // 4. Two integers, divide larger by smaller.
        int big = 20;
        int small = 5;
        int divInt = big / small;
        System.out.println("4. Integer division: " + divInt);
        // If we change the larger number to a decimal, we get a compile error
        // because you cannot assign a double to an int variable without casting.

        // 5. Two doubles, divide larger by smaller.
        double dBig = 20.5;
        double dSmall = 5.2;
        double divDbl = dBig / dSmall;
        System.out.println("5. Double division: " + divDbl);
        // Casting the result to an int
        System.out.println("   Casted to int: " + (int) divDbl);

        // 6. x=5, y=6. Assign y/x to q.
        int x = 5;
        int y = 6;
        double q = y / x; // Note: This will be 1.0, not 1.2, because it does integer division first!
        System.out.println("6. Initial q (int div): " + q);
        q = (double) y / x; // Now we cast y to double first
        System.out.println("   q after casting y: " + q);

        // 7. Named constant
        final double PI = 3.14159;
        double radius = 5.0;
        double area = PI * radius * radius;
        System.out.println("7. Area of circle (using constant): " + area);

        // 8. Cafe Products
        double coffeePrice = 2.50;
        double teaPrice = 1.75;
        double espressoPrice = 3.00;
        final double SALES_TAX = 0.08; // 8% tax

        double subtotal = (coffeePrice * 3) + (teaPrice * 4) + (espressoPrice * 2);
        double totalSale = subtotal + (subtotal * SALES_TAX);

        // Formatting to 2 decimal places using printf
        System.out.printf("8. Subtotal: $%.2f%n", subtotal);
        System.out.printf("   Total Sale: $%.2f%n", totalSale);
    }
}
