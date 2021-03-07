package conditional;

import java.util.Scanner;

public class CondProgram3 {
    public static void main(String[] args) {
        int unit, costPerUnit =100, totalCost;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of quantity");
        unit = scanner.nextInt();
        totalCost = unit * costPerUnit;
        if (totalCost > 1000){
            totalCost = totalCost - (totalCost/10);
            System.out.println("Total cost after discount is "+totalCost);
        }
        else{
            System.out.println("Total cost is "+totalCost);
        }

    }
}
