package PA_303_4_1;

import java.util.Scanner;

public class ControlFlowStatements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // --- Exercise 7: Tax Calculator ---
        System.out.println("Exercise 7: Tax Calculator");
        System.out.println("Enter Filing Status:");
        System.out.println("1 - Single");
        System.out.println("2 - Married Filing Jointly");
        System.out.println("3 - Married Filing Separately");
        System.out.println("4 - Head of Household");
        int status = scan.nextInt();

        System.out.print("Enter your income: ");
        double income = scan.nextDouble();
        double tax = 0;

        // Logic based on the provided tax table
        switch (status) {
            case 1: // Single
                if (income <= 8350) tax = income * 0.10;
                else if (income <= 33950) tax = 835 + (income - 8350) * 0.15;
                else if (income <= 82250) tax = 4675 + (income - 33950) * 0.25;
                else if (income <= 171550) tax = 16750 + (income - 82250) * 0.28;
                else if (income <= 372950) tax = 41754 + (income - 171550) * 0.33;
                else tax = 108216 + (income - 372950) * 0.35;
                break;
            case 2: // Married Filing Jointly
                if (income <= 16700) tax = income * 0.10;
                else if (income <= 67900) tax = 1670 + (income - 16700) * 0.15;
                else if (income <= 137050) tax = 9350 + (income - 67900) * 0.25;
                else if (income <= 208850) tax = 26637.50 + (income - 137050) * 0.28;
                else if (income <= 372950) tax = 46741.50 + (income - 208850) * 0.33;
                else tax = 100894.50 + (income - 372950) * 0.35;
                break;
            case 3: // Married Filing Separately
                if (income <= 8350) tax = income * 0.10;
                else if (income <= 33950) tax = 835 + (income - 8350) * 0.15;
                else if (income <= 68525) tax = 4675 + (income - 33950) * 0.25;
                else if (income <= 104425) tax = 13318.75 + (income - 68525) * 0.28;
                else if (income <= 186475) tax = 23370.75 + (income - 104425) * 0.33;
                else tax = 50447.25 + (income - 186475) * 0.35;
                break;
            case 4: // Head of Household
                if (income <= 11950) tax = income * 0.10;
                else if (income <= 45500) tax = 1195 + (income - 11950) * 0.15;
                else if (income <= 117450) tax = 6227.50 + (income - 45500) * 0.25;
                else if (income <= 190200) tax = 24215 + (income - 117450) * 0.28;
                else if (income <= 372950) tax = 44585 + (income - 190200) * 0.33;
                else tax = 104892.50 + (income - 372950) * 0.35;
                break;
            default:
                System.out.println("Invalid Status");
                break;
        }

        System.out.printf("Total tax: $%.2f%n", tax);

        scan.close();
    }
}

