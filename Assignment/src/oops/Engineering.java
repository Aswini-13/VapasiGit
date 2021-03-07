package oops;

public class Engineering extends Library{
    public void lab(){
        System.out.println("I am in lab");
    }
    Engineering(String author, long isbn, boolean isBookRented){
        super( author, isbn, isBookRented);
    }
    Engineering(String type, String material){
        super( type, material);
    }
    Engineering(int age, String fName, String lName){
        super( age, fName,lName);
    }
}
