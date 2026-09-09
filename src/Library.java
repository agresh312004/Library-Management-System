import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();
    private List<User> users = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully.");
    }

    public void addUser(User user) {
        users.add(user);
        System.out.println("User added successfully.");
    }

    public void displayBooks() {
        System.out.println("\n--- Books ---");
        for (Book book : books) {
            book.displayBook();
        }
    }

    public void displayUsers() {
        System.out.println("\n--- Users ---");
        for (User user : users) {
            user.displayUser();
        }
    }

    public void issueBook(int bookId, int userId) {
        Book book = findBook(bookId);
        User user = findUser(userId);

        if (book == null) {
            System.out.println("Book not found.");
            return;
        }

        if (user == null) {
            System.out.println("User not found.");
            return;
        }

        if (book.isIssued()) {
            System.out.println("Book is already issued.");
            return;
        }

        book.setIssued(true);
        System.out.println("Book '" + book.getTitle() + "' issued to " + user.getName() + ".");
    }

    public void returnBook(int bookId) {
        Book book = findBook(bookId);

        if (book == null) {
            System.out.println("Book not found.");
            return;
        }

        if (!book.isIssued()) {
            System.out.println("Book is already available.");
            return;
        }

        book.setIssued(false);
        System.out.println("Book '" + book.getTitle() + "' returned successfully.");
    }

    private Book findBook(int bookId) {
        for (Book book : books) {
            if (book.getBookId() == bookId) {
                return book;
            }
        }
        return null;
    }

    private User findUser(int userId) {
        for (User user : users) {
            if (user.getUserId() == userId) {
                return user;
            }
        }
        return null;
    }
}
