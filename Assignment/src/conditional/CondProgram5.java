package conditional;

import java.util.Scanner;

public class CondProgram5 {
    public static void main(String[] args) {
        int marks;
        System.out.println("Enter the marks");
        Scanner scanner = new Scanner(System.in);
        marks = scanner.nextInt();
        if(marks > 80) {
            System.out.println("Grade is A");
        }
        else if(marks >= 60) {
            System.out.println("Grade is B");
        }
        else if(marks >= 50){
            System.out.println("Grade is C");
        }
        else if (marks >= 45){
            System.out.println("Grade is D");
        }
        else if(marks >= 25){
            System.out.println("Grade is E");
        }
        else{
            System.out.println("Grade is F");
        }
    }
}
