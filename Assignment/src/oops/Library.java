package oops;

public class Library{
    static int numberOfBooks, numberOfBooksRented, numberOfChairs, numberOfStaff;
    String author;
    long isbn;
    boolean isBookRented;
    String type, material;
    int age;
    String fName, lName;
    static int eldestAge;
    static String eldestFName, eldestLName;
    public Library(String author, long isbn, boolean isBookRented){
        this.author = author;
        this.isbn = isbn;
        this.isBookRented = isBookRented;
        numberOfBooks++;
        if(isBookRented){
            numberOfBooksRented++;
        }
    }
    public Library (String type, String material){
         this.type = type;
         this.material = material;
         if(type =="Chair"){
            numberOfChairs++;
         }

    }
    public Library(int age, String fName, String lName){
        this.age = age;
        this.fName = fName;
        this.lName = lName;
        numberOfStaff++;
        if (eldestAge < age){
            eldestAge = age;
            eldestFName = fName;
            eldestLName = lName;
        }
    }
    public Library(){

    }

    public int getNumberOfBooks() {
        return this.numberOfBooks;
    }
    public int getNumberOfBooksRented() {
        return this.numberOfBooksRented;
    }
    public int getNumberOfChairs() {
        return this.numberOfChairs;
    }

    public int getNumberOfStaff() {
        return this.numberOfStaff;
    }

    public void getEldestStaffName() {
        System.out.println("Eldest staff "+eldestFName+" "+eldestLName);
    }
}
