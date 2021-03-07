package userinput;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        int num1, num2, sum, product;
        System.out.println("Enter two integer inputs");
        Scanner scanner = new Scanner((System.in));
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        sum = num1 + num2;
        product = num1 * num2;

        System.out.println("sum of obtained result is "+(sum+product));
        System.out.println("Product of obtained result is "+(sum*product));
    }
}
