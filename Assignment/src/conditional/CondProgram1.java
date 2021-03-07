package conditional;

import java.util.Scanner;

public class CondProgram1 {
    public static void main(String[] args) {
        int length, breadth;
        System.out.println("Enter the length and breadth of a rectangle");
        Scanner scanner = new Scanner(System.in);
        length = scanner.nextInt();
        breadth = scanner.nextInt();
        if (((length !=0) && (breadth !=0)) && (length == breadth) ){
            System.out.println("It is a square");
        }
        else{
            System.out.println("It is not a square");
        }
    }
}
