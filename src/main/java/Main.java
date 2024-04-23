public class Main {
    public static void  main(String[] args) {
        // Create library without books
        Library myLib = new Library(new Book[100]);
        System.out.println(myLib);

        // Add a books
        Book georgeOrwell = new Book("1984", "George Orwell", "978-0451524935");
        Book harperLee = new Book("To Kill a Mockingbird", "Harper Lee", "978-0061120084");
        Book danBrown = new Book("The Da Vinci Code", "Dan Brown", "978-0307474278");
        Book jonasHonecker = new Book("Yoyoyoyo", "Jonas Honecker", "1337-3537");
        myLib.addBook(georgeOrwell);
        myLib.addBook(harperLee);
        myLib.addBook(danBrown);
        myLib.addBook(jonasHonecker);
        System.out.println(myLib);

        // Delete a book
        myLib.deleteBookByIsbn("978-0307474278");
        myLib.deleteBookByIsbn("978-0061120084");
        myLib.deleteBookByIsbn("1337-3537");
        System.out.println(myLib);
    }
}
