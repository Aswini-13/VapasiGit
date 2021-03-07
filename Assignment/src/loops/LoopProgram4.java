package loops;

public class LoopProgram4 {
    public static void main(String[] args) {
        char c;
        System.out.println("ASCII table :");
        for (int i = 0; i <= 255; i++) {
            c = (char) i;
            System.out.println("Ascii value :" + i + "   Ascii Character :" + c);
        }

    }
}
