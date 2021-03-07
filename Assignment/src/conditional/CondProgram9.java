package conditional;

import java.util.Scanner;

public class CondProgram9 {
    public static void main(String[] args) {
        int nocAttended, nocHeld, percentage ;
        float temp;
        String medIssue;
        System.out.println("enter the number of classes held");
        Scanner scanner =new Scanner(System.in);
        nocHeld = scanner.nextInt();
        System.out.println("enter the number of classes attended");
        nocAttended = scanner.nextInt();
        System.out.println("Is there any medical issue  ( 'Y' or 'N' ) ");
        medIssue = scanner.next();
        temp = (float)(nocHeld-nocAttended)/nocHeld;
        percentage = (int)(100 - (temp*100));
        System.out.println("Percentage of class attended is " +percentage);
        if(percentage > 75){
            System.out.println("student is allowed to sit in exam");
        }
        else if (medIssue.equals("Y")) {
            System.out.println("student is allowed to sit in exam");
        }
        else if (medIssue.equals("N")){
            System.out.println("student is not allowed to sit in exam");
        }
        else{
            System.out.println("Invalid input");
        }


    }
}
