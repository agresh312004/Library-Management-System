public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Add books
        library.addBook(new Book(101, "Clean Code", "Robert C. Martin"));
        library.addBook(new Book(102, "Effective Java", "Joshua Bloch"));
        library.addBook(new Book(103, "Head First Java", "Kathy Sierra"));

        // Add users
        library.addUser(new User(1, "Agresh"));
        library.addUser(new User(2, "Rahul"));

        // Display initial data
        library.displayBooks();
        library.displayUsers();

        // Issue a book
        System.out.println("\n--- Issue Book ---");
        library.issueBook(101, 1);

        // Try issuing the same book again
        library.issueBook(101, 2);

        // Display after issue
        library.displayBooks();

        // Return the book
        System.out.println("\n--- Return Book ---");
        library.returnBook(101);

        // Display after return
        library.displayBooks();

        // Demonstrate polymorphism
        System.out.println("\n--- Polymorphism Demo ---");
        LibraryMember student = new StudentMember(201, "Amit");
        LibraryMember faculty = new FacultyMember(202, "Dr. Sharma");

        student.showMemberType();
        faculty.showMemberType();
    }
}
