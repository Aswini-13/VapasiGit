package loops;

public class LoopProgram3 {
    public static void main(String[] args) {

        int tableNum[] = {24,50,29};

        for(int j=0; j<3; j++){
            System.out.println("Multiplication table for " + tableNum[j]);
            for (int i = 1; i <= 10; i++) {

                System.out.println(tableNum[j] + " * " + i + " = " + (tableNum[j] * i));
            }

        }
    }
}
