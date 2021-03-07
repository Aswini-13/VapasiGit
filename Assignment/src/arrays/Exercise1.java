package arrays;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        HashSet<String> carNumber = new HashSet<>();
        System.out.println("Enter the number of unique numbers to be generated");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        Random random = new Random();
        for(int i = 0 ; i < number; i++){
            int uniqueNumber = random.nextInt(9999);
            carNumber.add("MH"+uniqueNumber);
        }
        System.out.println("Car numbers :"+carNumber);
    }

}
