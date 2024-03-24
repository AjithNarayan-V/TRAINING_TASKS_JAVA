import java.util.ArrayList;
import java.util.List;

class Author {
    private String name;
    private String biography;

    public Author(String name, String biography) {
        this.name = name;
        this.biography = biography;
    }

    @Override
    public String toString() {
        return "Author: " + name;
    }
}

class Book {
    String title;
    Author author;
    private int publicationYear;

    public Book(String title, Author author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    @Override
    public String toString() {
        return "Book: " + title + " by " + author.toString() + ", published in " + publicationYear;
    }
}

class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> searchBooksByAuthor(String authorName) {
        List<Book> foundBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.author.toString().equals(authorName)) {
                foundBooks.add(book);
            }
        }
        return foundBooks;
    }

    public List<Book> searchBooksByTitle(String title) {
        List<Book> foundBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.title.toLowerCase().contains(title.toLowerCase())) {
                foundBooks.add(book);
            }
        }
        return foundBooks;
    }
}

public class library {
    public static void main(String[] args) {
        Author author1 = new Author("J.K. Rowling", "British author best known for the Harry Potter series.");
        Author author2 = new Author("George Orwell", "English novelist, essayist, journalist, and critic.");
        Book book1 = new Book("Harry Potter and the Philosopher's Stone", author1, 1997);
        Book book2 = new Book("1984", author2, 1949);

        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);

        List<Book> searchResultsByAuthor = library.searchBooksByAuthor("J.K. Rowling");
        List<Book> searchResultsByTitle = library.searchBooksByTitle("1984");

        System.out.println("Books by J.K. Rowling:");
        for (Book book : searchResultsByAuthor) {
            System.out.println(book);
        }

        System.out.println("\nBooks containing '1984' in the title:");
        for (Book book : searchResultsByTitle) {
            System.out.println(book);
        }
    }
}
