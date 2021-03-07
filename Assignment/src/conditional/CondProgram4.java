package conditional;

import java.util.Scanner;

public class CondProgram4 {
    public static void main(String[] args) {

        int salary, yearsOfService, bonus;
        System.out.println("Enter the salary");
        Scanner scanner = new Scanner(System.in);
        salary = scanner.nextInt();
        System.out.println("Enter the years of service");
        yearsOfService = scanner.nextInt();
        if(yearsOfService > 5){
            bonus = salary/20;
            System.out.println("Bonus amount is "+bonus);
        }
        else{
            System.out.println("Bonus amount is nil");
        }
    }
}
