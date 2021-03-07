package inheritance;

public class Laptop {
    public static String name;
    public static int price = 1000;
    public static String processor = "i";
    public static String ram ="GB";
    public static String harddrive = "TB";

    Laptop(String name, int price, String processor, String ram, String harddrive)
    {
        this.name = name;
        this.price = price;
        this.processor = processor;
        this.ram = ram;
        this.harddrive = harddrive;
    }
    Laptop(){

    }
    public void printDetails()
    {
        System.out.println("Name : "+ name);
        System.out.println("Price : $"+ price);
        System.out.println("Processor : "+ processor);
        System.out.println("Ram : "+ ram);
        System.out.println("HDD : "+ harddrive);
        System.out.println("*************************************");
    }


}
