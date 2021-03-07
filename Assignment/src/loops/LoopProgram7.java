package loops;

import java.util.ArrayList;
import java.util.Scanner;

public class LoopProgram7 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int num, sum =0, product =0;
        Scanner scanner = new Scanner(System.in);
        String check = "a";
        while (! check.equals("q")){
            System.out.println("Enter the integer input or press q to exit");
            check = scanner.next();
            if (! check.equals("q")) {
                num = Integer.parseInt(check);
                arr.add(num);
                product =1;
            }
        }

        for (int j =0; j <arr.size();j++) {
            sum = sum + arr.get(j);
            product = product * arr.get(j);
        }
        System.out.println("The sum is "+sum);
        System.out.println("The product is "+product);
    }

}
