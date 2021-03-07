package arrays;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        String[] weekDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.println("Enter the day of the week, ie 1 to 7:");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println("Day " + input + " of the week is " + weekDays[input - 1]);
    }
}
