public class Main {
    public static void  main(String[] args) {
        Book georgeOrwell = new Book("1984", "George Orwell", "978-0451524935");
        Book harperLee = new Book("To Kill a Mockingbird", "Harper Lee", "978-0061120084");
        Book danBrown = new Book("The Da Vinci Code", "Dan Brown", "978-0307474278");

        Library myLib = new Library(new Book[]{georgeOrwell, harperLee, danBrown});
        System.out.println(myLib);
    }
}
