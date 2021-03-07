package conditional;

import java.util.Scanner;

public class CondProgram8 {
    public static void main(String[] args) {
        int nocAttended, nocHeld, percentage ;
        float temp;
        System.out.println("enter the number of classes held");
        Scanner scanner =new Scanner(System.in);
        nocHeld = scanner.nextInt();
        System.out.println("enter the number of classes attended");
        nocAttended = scanner.nextInt();
        temp = (float)(nocHeld-nocAttended)/nocHeld;
        percentage = (int)(100 - (temp*100));
        System.out.println("Percentage of class attended is " +percentage);
        if(percentage > 75){
            System.out.println("student is allowed to sit in exam");
        }
        else{
            System.out.println("student is not allowed to sit in exam");
        }


    }
}
