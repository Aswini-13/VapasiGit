package conditional;

import java.util.Scanner;

public class CondProgram11 {
    public static void main(String[] args) {
        System.out.println("enter a lowercase or uppercase character ");
        Scanner scanner = new Scanner(System.in);
        char charCheck = scanner.next().charAt(0);
        if((charCheck >= 65 ) && (charCheck <= 90)){
            System.out.println("Entered character is Uppercase");
        }
        else if((charCheck >= 97 ) && (charCheck <= 122)){
            System.out.println("Entered character is lowercase");
        }
        else{
            System.out.println("Invalid input");
        }
    }
}
