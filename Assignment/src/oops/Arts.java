package oops;

public class Arts extends Library{
    public void music(){
        System.out.println("I am in music room");
    }
    Arts(String author, long isbn, boolean isBookRented){
        super( author, isbn, isBookRented);
    }

    Arts(String type, String material){
        super( type, material);
    }
    Arts(int age, String fName, String lName){
        super( age, fName,lName);
    }
}
