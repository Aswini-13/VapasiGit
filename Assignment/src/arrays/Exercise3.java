package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int sum =0, avg;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of grades");
        int noOfGrades = scanner.nextInt();
        System.out.println("Enter the grades (out of 100)");
        for(int i=0; i< noOfGrades; i++) {
            int grade = scanner.nextInt();
            arr.add(grade);
            sum = sum + grade;
        }
        avg = sum / noOfGrades;
        Collections.sort(arr);

        for(int i:arr) {
            System.out.println("after sort:" + i);
        }
        System.out.println("Average Score:" + avg);
        System.out.println("Highest Score:" + arr.get(noOfGrades-1));
        System.out.println("Lowest Score:" + arr.get(0));

    }
}
