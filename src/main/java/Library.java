import java.util.Arrays;
import java.util.Objects;

public class Library {
    private Book[] books;

    public Library(Book[] books) {
        this.books = removeNullValues(books);
    }

    private Book[] removeNullValues(Book[] books) {
        // Count null values
        int numberOfNullValues = 0;
        for (Book currentBook : books) {
            if (currentBook == null) {
               numberOfNullValues++;
            }
        }
        // Create new book array and fill with values
        Book[] bookArrayWithoutNullValues = new Book[books.length - numberOfNullValues];
        int counter = 0;
        for (Book currenBook : books) {
            if (currenBook != null) {
                bookArrayWithoutNullValues[counter] = currenBook;
            }
        }
        return bookArrayWithoutNullValues;
    }

    public void addBook(Book newBook){
        this.books = Arrays.copyOf(this.books, this.books.length + 1);
        this.books[this.books.length - 1] = newBook;
    }

    public void deleteBookByIsbn(String isbnToDelete) {
        // Create shorter book array to store all books that shall be kept
        Book[] newBookArray = new Book[this.books.length - 1];
        int counter = 0;
        boolean bookToDeleteFound = false;
        for (Book currentBook : this.books) {
            if (!Objects.equals(currentBook.isbn, isbnToDelete)) {
                newBookArray[counter] = currentBook;
                counter++;
            } else {
                bookToDeleteFound = true;
            }
        }
        if (bookToDeleteFound) {
            this.books = newBookArray;
        }
    }

    @Override
    public String toString() {
        return "Library{" +
                "books=" + Arrays.toString(books) +
                '}';
    }
}
