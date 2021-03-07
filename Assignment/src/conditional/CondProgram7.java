package conditional;

import java.util.Scanner;

public class CondProgram7 {
    public static void main(String[] args) {
        int num, absNum;
        System.out.println("enter a number");
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        if(num<0){
            absNum = num * -1;
        }
        else{
            absNum = num;
        }
        System.out.println("absolute number is "+absNum);
    }
}
