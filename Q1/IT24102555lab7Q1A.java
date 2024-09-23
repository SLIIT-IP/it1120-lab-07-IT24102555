import java.util.Scanner; 
public class IT24102555lab7Q1A{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double totalmarks = 0;
        String grade;
        
        System.out.println("Enter marks for four subjects:");
        
        for(int count = 0; count < 4; count++) {
            System.out.print("Enter subject marks " + (count+1) + ": ");
            double marks = input.nextDouble();
            totalmarks += marks;
        }
        
        double average = totalmarks / 4;
        
        System.out.println("The Average is: " + average);
        
        if(average >= 75){
            grade = "Distinction";
        } else if(average >= 50){
            grade = "Credit";
        } else {
            grade = "Fail";
        }
        
        System.out.print("The grade of the student is: " + grade);
    }
}
