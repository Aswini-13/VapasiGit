package inheritance;

public class LaptopStore extends Laptop{
    public static void main(String[] args) {
        Laptop first = new Laptop("Lenovo", 1000, "i3","2GB", "500GB");
        first.printDetails();

        Laptop second = new Laptop("Dell", 1500, "i5", "4GB", "1TB");
        second.printDetails();

        Laptop third = new Laptop("Sony", 2000, "i9", "8GB", "1TB");
        third.printDetails();

    }

}
