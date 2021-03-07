package loops;

import java.util.Scanner;

public class LoopProgram6 {
    public static void main(String[] args) {
        int num1, num2, gcd = 1;
        System.out.println("Enter two numbers to find GCD");
        Scanner scanner = new Scanner(System.in);
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        for(int i=1; i<=num1 && i<= num2; i++){
            if((num1 % i == 0)&&(num2 % i ==0)){
                gcd = i;
            }
        }
        if (num1 == 0){
            gcd = 0;
        }
        else if(num2 == 0){
            gcd = 0;
        }

        System.out.println("G.C.D of "+num1+", "+num2+" is "+gcd);
    }
}
