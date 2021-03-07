package userinput;

import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        double length, breadth;
        int area;
        System.out.println("Enter two double input for length and breadth");
        Scanner scanner = new Scanner((System.in));
        length = scanner.nextDouble();
        breadth = scanner.nextDouble();
        area = (int)(length * breadth);
        System.out.println("Area of rectangle is "+area);
    }
}
