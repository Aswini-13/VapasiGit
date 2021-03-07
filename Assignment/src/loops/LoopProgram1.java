package loops;
import java.util.Scanner;

public class LoopProgram1 {
    public static void main(String[] args) {
        int input =0 ;
        double average;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the 10 integer inputs");
        for (int j=0; j<10; j++){
            input= input + scanner.nextInt();
        }
        average = input/2;
        System.out.println("Average of 10 inputs is "+ average);
    }
}
