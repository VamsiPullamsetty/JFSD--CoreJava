package StudentManagementSystem;
public class SMS {
    public static void main(String[] args){
    int id = 45;
    String name = "johnwick";
    int age = 43;
    int quizScore = 78;
    int assignmentScore = 77;
    int examScore = 79;
    int attendencePercentage = 75;
    attendencePercentage++;
    System.out.println("Student name is : " + name);
    System.out.println("Student id is : " + id);
    System.out.println("Student age is : " + age);
    System.out.println("total score is : " +(quizScore+ assignmentScore + examScore));    
    System.out.println("Average score : " +(quizScore+ assignmentScore + examScore/3));  
    System.out.println("Attendence is : " +attendencePercentage);
    System.out.println("Passed : " +(examScore >= 75) );

}
}
