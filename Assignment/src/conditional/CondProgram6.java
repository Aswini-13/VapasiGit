package conditional;

import java.util.Scanner;

public class CondProgram6 {
    public static void main(String[] args) {

        int age1, age2, age3;
        System.out.println("enter the age of 3 people");
        Scanner scanner = new Scanner(System.in);
        age1 = scanner.nextInt();
        age2 = scanner.nextInt();
        age3 = scanner.nextInt();
        if((age1>age2) && (age1 > age3)){
            System.out.println(age1+" is oldest");
        }
        else if(age2 > age3){
            System.out.println(age2+" is oldest");
        }
        else{
            System.out.println(age3+" is oldest");
        }

        if((age1<age2) && (age1<age3)){
            System.out.println(age1+" is youngest");
        }
        else if (age2 < age3){
            System.out.println(age2+" is youngest");
        }
        else{
            System.out.println(age3+" is youngest");
        }

    }

}
