package userinput;

import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        int num1, num2, sum, product;
        System.out.println("Enter two integer inputs");
        Scanner scanner = new Scanner((System.in));
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        sum = num1 + num2;
        System.out.println("sum is "+sum);
        product = num1 * num2;
        System.out.println("product is "+product);
    }
}
