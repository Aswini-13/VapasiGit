package conditional;

public class CondProgram10 {
    public static void main(String[] args) {
        int x = 2, y = 5, z = 0;
        if(x ==2){
            System.out.println("a: true ");
        }
        else {
            System.out.println("a: false");
        }

        if(x != 5){
            System.out.println("b: true ");
        }
        else {
            System.out.println("b: false");
        }

        if((x != 5) && (y >= 5)){
            System.out.println("c: true");
        }
        else {
            System.out.println("c: false");
        }

        if((z != 0) || (x == 2)){
            System.out.println("d: true");
        }
        else {
            System.out.println("d: false");
        }

        if(!(y < 10)){
            System.out.println("e: true");
        }
        else {
            System.out.println("e: false");
        }

    }
}
