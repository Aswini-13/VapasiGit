package oops;

public class College {
    public static void main(String[] args) {
        Arts book1 = new Arts("JKRowling", 1234567891234L, true);
        Arts book2 = new Arts("DanBrown", 7777767891234L, false);
        Engineering book3 = new Engineering("JackWills",8888333383333L, true);
        Engineering book4 = new Engineering("JohnWalter",8999999983333L, false);

        Arts furn1 = new Arts("Chair","Wood");
        Arts furn2 = new Arts("Rack","Iron");
        Engineering furn3 = new Engineering("Chair","Iron");
        Engineering furn4 = new Engineering("Table","Wood");

        Arts staff1 = new Arts(35,"Suresh", "Kumar");
        Arts staff2 = new Arts(45,"Bhavani","Shree");
        Engineering staff3 = new Engineering(30,"Shilpa", "Naik");
        Engineering staff4 = new Engineering(40,"Ramesh", "Kumar");

        System.out.println("Books available in college "+book4.getNumberOfBooks());
        System.out.println("Books rented in college "+book4.getNumberOfBooksRented());
        System.out.println("Chairs available in college "+furn4.getNumberOfChairs());
        System.out.println("Total staff in college "+staff4.getNumberOfStaff());
        staff4.getEldestStaffName();
    }
}
