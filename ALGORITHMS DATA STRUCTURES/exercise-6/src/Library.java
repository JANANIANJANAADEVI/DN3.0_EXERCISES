import java.util.Arrays;
import java.util.Comparator;

public class Library {
    private Book[] books;
    private int size;
    private int capacity;

    // Constructor
    public Library(int capacity) {
        this.capacity = capacity;
        this.books = new Book[capacity];
        this.size = 0;
    }

    // Add Book
    public void addBook(Book book) {
        if (size < capacity) {
            books[size] = book;
            size++;
        } else {
            System.out.println("Library is full. Cannot add more books.");
        }
    }

    // Linear Search by Title
    public Book linearSearchByTitle(String title) {
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                return books[i];
            }
        }
        return null;
    }

    // Binary Search by Title (assuming list is sorted)
    public Book binarySearchByTitle(String title) {
        int left = 0;
        int right = size - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = books[mid].getTitle().compareToIgnoreCase(title);
            if (comparison == 0) {
                return books[mid];
            } else if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }

    // Sort books by title (necessary for binary search)
    public void sortBooksByTitle() {
        Arrays.sort(books, 0, size, Comparator.comparing(Book::getTitle, String.CASE_INSENSITIVE_ORDER));
    }

    public static void main(String[] args) {
        Library library = new Library(5);
        Book b1 = new Book(1, "The Great Gatsby", "F. Scott Fitzgerald");
        Book b2 = new Book(2, "Moby Dick", "Herman Melville");
        Book b3 = new Book(3, "1984", "George Orwell");

        library.addBook(b1);
        library.addBook(b2);
        library.addBook(b3);

        System.out.println("Books in the library:");
        library.sortBooksByTitle();
        for (int i = 0; i < library.size; i++) {
            System.out.println(library.books[i]);
        }

        System.out.println("\nLinear Search for 'Moby Dick':");
        Book foundBook = library.linearSearchByTitle("Moby Dick");
        System.out.println(foundBook != null ? foundBook : "Book not found.");

        System.out.println("\nBinary Search for '1984':");
        foundBook = library.binarySearchByTitle("1984");
        System.out.println(foundBook != null ? foundBook : "Book not found.");
    }
}
