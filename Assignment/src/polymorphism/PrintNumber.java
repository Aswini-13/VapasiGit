package polymorphism;

public class PrintNumber {
    public void println(int no){
        System.out.println("Integer:"+no);
    }
    public void println(float no){
        System.out.println("Float:"+no);
    }
    public void println(double no){
        System.out.println("Double:"+no);
    }
    public void println(char no){
        System.out.println("Character:"+no);
    }

    public static void main(String[] args) {

        PrintNumber printnum = new PrintNumber();
        printnum.println(2);
        printnum.println(3.67777);
        printnum.println(5.999999999999999);
        printnum.println('a');

    }
}
