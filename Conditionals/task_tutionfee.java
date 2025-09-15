package Conditionals;

import java.util.Scanner;

public class task_tutionfee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1) Read inputs
        System.out.print("Enter student's grade (1-12): ");
        int grade = sc.nextInt();

        // validate grade
        if (grade < 1 || grade > 12) {
            System.out.println("Invalid grade. Please enter a grade between 1 and 12.");
            sc.close();
            return;
        }

        System.out.print("Enter base tuition fee: ");
        double baseFee = sc.nextDouble();
        if (baseFee < 0) {
            System.out.println("Base fee cannot be negative.");
            sc.close();
            return;
        }

        System.out.print("Is the student an academic topper? (yes/no): ");
        String topperInput = sc.next(); // using next() avoids the common newline issue
        boolean isTopper = topperInput.equals("yes");

        // 2) Determine base discount using nested conditionals
        double discountPercent = 0.0;

        if (grade >= 9 && grade <= 12) {
            // nested conditional: inside 9-12 we check topper status
            if (isTopper) {
                discountPercent = 20.0; // academic topper in 9-12
            } else {
                discountPercent = 10.0; // non-topper in 9-12
            }
        } else if (grade >= 6 && grade <= 8) {
            discountPercent = 5.0; // grades 6-8
        } else {
            discountPercent = 0.0; // below grade 6, no discount
        }

        // 3) Apply additional grade-specific discounts
        if (grade == 10) {
            discountPercent += 3.0; // extra 3% for grade 10
        } else if (grade == 12) {
            discountPercent += 5.0; // extra 5% for grade 12
        }

        // 4) Calculate money values
        double discountAmount = baseFee * discountPercent / 100.0;
        double feeToPay = baseFee - discountAmount;

        // 5) Display output (formatted to 2 decimal places)
        System.out.println("Fee Summary");
        System.out.println("Student Grade       : " + grade);
        System.out.println("Student Base Fee    : " + baseFee);
        System.out.println("Total Discount (%)  : " + discountPercent + "%");
        System.out.println("Discount Amount     : " + discountAmount);
        System.out.println("Fee To Pay          : " + feeToPay);

    }
}

