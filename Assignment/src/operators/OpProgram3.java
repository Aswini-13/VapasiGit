package operators;

import java.util.Scanner;

public class OpProgram3 {
    public static void main(String[] args) {
        double fahrenheit, celsius;
        System.out.println("Enter a degree fahrenheit");
        Scanner scanner = new Scanner(System.in);
        fahrenheit = scanner.nextDouble();
        celsius = ((5 *(fahrenheit-32))/9);
        System.out.println("Degree celsius is "+celsius);


    }
}
