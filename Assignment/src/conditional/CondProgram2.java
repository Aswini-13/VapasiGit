package conditional;

import java.util.Scanner;

public class CondProgram2 {
    public static void main(String[] args) {
        int num1, num2;
        System.out.println("Enter two numbers");
        Scanner scanner = new Scanner(System.in);
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        if(num1 > num2){
            System.out.println(num1+" is greater");
        }
        else if(num2 > num1){
            System.out.println(num2+ " is greater");
        }
        else{
            System.out.println("Both are equal");
        }
    }
}
