package polymorphism;

public class Area {
    public void area(int l, int b){
        int aor = l * b;
        System.out.println("Area of rectangle:"+aor);
    }
    public void area(int s){
        int aos = s*s;
        System.out.println("Area of square:"+aos);
    }

    public static void main(String[] args) {

        Area a1 = new Area();
        a1.area(2,3); // calls the area of rectangle method
        a1.area(5); // calls the area of square method

    }
}
