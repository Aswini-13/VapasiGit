package loops;

import java.util.Scanner;

public class LoopProgram5 {
    public static void main(String[] args) {
        int num, fact = 1;
        System.out.println("Enter the number to find factorial");
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();

        if(num>= 1) {
            for (int i = 1; i <= num; i++) {
                fact = fact * i;
            }
            System.out.println(num + "! is " + fact);
        }
        else if(num ==0) {
            fact = 0;
            System.out.println(num + "! is " + fact);
        }
        else{
            System.out.println("Not a valid number");
        }

    }
}
