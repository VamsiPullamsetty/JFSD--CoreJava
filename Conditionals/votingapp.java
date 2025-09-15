package Conditionals;

import java.util.Scanner;

public class votingapp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Name: ");
        String name =sc.next();
        System.out.println("Welcome: "+name);

        System.out.println("Enter Your Age: ");
        int age = sc.nextInt();
        // voting app dynamic
        if (age >= 18) {
           System.out.println("You can Vote"); 
        } else {
            System.out.println("You cannot Vote");
            System.out.println("Your Age is: "+age);
        }

        // voting app dynamic with nested conditionals
        System.out.println("Enter Your Age: ");
        int newage = sc.nextInt();
        // voting app dynamic
        if (newage >= 18) {
            System.out.println("Do You have ID: (yes/no)");
            String has_id = sc.next();
            if (has_id == "yes"){
                System.out.println("You can Vote");
            } else {
                System.out.println("You Need ID to Vote");
            }       
        } 
        else {
            System.out.println("You cannot Vote Too Young");
        }
        

    }

    
}
