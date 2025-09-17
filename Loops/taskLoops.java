package Loops;
import java.util.Scanner;
public class taskLoops {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name");
        String name = sc.next();
        System.out.println("enter your id");
        int id =sc.nextInt();
        System.out.println("enter your attendence");
        int attendence = sc.nextInt();
        System.out.println("enter your subjects");
        int numberOfSubjects = sc.nextInt();

        for(int i=0;i<numberOfSubjects;i++){
            System.out.println("enter marks");
            int scores = sc.nextInt();
            sum+=scores;  
        }

        int totalavg = sum/numberOfSubjects;
        String grade="Fail";

        if(totalavg>=85) {
            grade="A";
            //System.out.println("A");
        } else if( totalavg>=75 && totalavg<= 84) {
            grade="B";
           //System.out.println("B");
        }else if( totalavg>=60 && totalavg <=74) {
            grade="C";
            //System.out.println("C");
        }else if(totalavg <= 59 && totalavg >=35 ){
            grade="D";
            //System.out.println("D");  
        } //else (totalavg < 45) {
        //     System.out.println("F");
        // } 
        String award ="No";
        if(attendence >= 75 && totalavg >=85) {
            award="Awarded";
        }

        System.out.println("Student Name: "+ name);
        System.out.println("Student id: "+ id);
        System.out.println("Total Score: "+ sum);
        System.out.println("Average Score: "+ totalavg);
        System.out.println("Student Grade is: "+ grade);
        System.out.println("Award: "+award);

    }

}
