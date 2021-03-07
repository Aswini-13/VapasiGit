package loops;

public class LoopProgram2b {
    public static void main(String[] args) {

        for (int i = 1; i <= 3; i++) {
            for (int j = 5-i; j >= i; j=j-2) {
                System.out.print(" ");
            }
            for (int j = i-1; j > 0; j--) {
                System.out.print("**");
            }
            System.out.println("*");
        }
        for (int i = 1; i <= 2; i++) {
            for (int j = i-1; j > 0; j--) {
                System.out.print(" ");
            }

            System.out.print(" *");
            for (int j = 2-i; j > 0; j--) {
                System.out.println("**");
            }
        }
    }
}
