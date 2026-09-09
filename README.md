# Library Management System – Task 3

A mini Java console application for managing books and users using Object-Oriented Programming (OOP).

## Objective
Develop a mini system to manage books and users with book issue and return functionality.

## Technologies
- Java
- VS Code / Terminal
- Java Collections (`ArrayList`)

## Features
- Add books and users
- Display all books and users
- Issue a book to a user
- Prevent issuing an already issued book
- Return a book
- Validate book and user IDs
- Demonstrate abstraction, inheritance, polymorphism and method overriding

## Project Structure
```text
Library-Management-System/
├── README.md
└── src/
    ├── Book.java
    ├── User.java
    ├── Library.java
    ├── LibraryMember.java
    ├── StudentMember.java
    ├── FacultyMember.java
    └── Main.java
```

## OOP Concepts Used

### 1. Encapsulation
`Book`, `User`, and `LibraryMember` keep their fields private and provide methods to access or modify required data.

### 2. Abstraction
`LibraryMember` is an abstract class containing the abstract method `showMemberType()`.

### 3. Inheritance
`StudentMember` and `FacultyMember` extend `LibraryMember`.

### 4. Polymorphism
A `LibraryMember` reference can refer to a `StudentMember` or `FacultyMember` object. The overridden `showMemberType()` method is selected at runtime.

### 5. Method Overriding
Both member subclasses override `showMemberType()` to provide their own implementation.

### 6. IS-A and HAS-A
- `StudentMember IS-A LibraryMember`
- `FacultyMember IS-A LibraryMember`
- `Library HAS-A collection of Books and Users`

### 7. Constructor Chaining
Child-class constructors use `super()` to call the parent-class constructor.

## How to Run

Open the project folder in the terminal and run:

```bash
javac -d out src/*.java
java -cp out Main
```

## Sample Operations
1. Add three books.
2. Add two users.
3. Display books and users.
4. Issue book 101 to user 1.
5. Attempt to issue the same book again.
6. Return book 101.
7. Demonstrate runtime polymorphism using student and faculty members.

## Interview Topics Covered
- Abstraction
- Interface vs Abstract Class
- Polymorphism
- Method Overriding
- IS-A vs HAS-A
- Inheritance
- Dynamic Binding
- Constructor Chaining
- Encapsulation
- `super` keyword

## Task
This project is prepared for Internship Task 3: **Library Management System (Using OOP)**.
