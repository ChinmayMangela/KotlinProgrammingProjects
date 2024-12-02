package LibraryManagementSystem

import java.time.Year

fun main() {
    val book1 = Book("978-0134685991", "Effective Java", "Joshua Bloch", Year.of(2018), "Addison-Wesley", true)
    val book2 = Book("978-0321356680", "Clean Code", "Robert C. Martin", Year.of(2008), "Prentice Hall", true)
    val book3 = Book("978-0596009205", "Head First Design Patterns", "Eric Freeman, Elisabeth Robson", Year.of(2004), "O'Reilly Media", true)
    val book4 = Book("978-0132350884", "Domain-Driven Design", "Eric Evans", Year.of(2003), "Addison-Wesley", false)
    val book5 = Book("978-0134177304", "Java Concurrency in Practice", "Brian Goetz", Year.of(2006), "Addison-Wesley", true)
    val book6 = Book("978-0137081073", "Spring in Action", "Craig Walls", Year.of(2018), "Manning", true)
    val book7 = Book("978-0134494166", "Design Patterns: Elements of Reusable Object-Oriented Software", "Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides", Year.of(1994), "Addison-Wesley", true)
    val book8 = Book("978-0321356680", "Refactoring: Improving the Design of Existing Code", "Martin Fowler", Year.of(2018), "Addison-Wesley", true)
    val book9 = Book("978-0596007126", "The Pragmatic Programmer", "Andrew Hunt, David Thomas", Year.of(1999), "Addison-Wesley", true)
    val book10 = Book("978-0321127426", "Agile Software Development, Principles, Patterns, and Practices", "Robert C. Martin", Year.of(2005), "Prentice Hall", true)
    val book11 = Book()


    val books = mutableListOf(book1, book2, book3, book4, book5, book6, book7, book8, book9, book10)


    val myLibrary = Library("Chinmay's Library", books)
    var borrowedBooks =  mutableListOf<Book>()
    val monty = Member("2804", "Monty", borrowedBooks)
    monty.borrowBook(book1)
//    monty.returnBook(book11)
    monty.returnBook(book1)
    for(book in borrowedBooks) {
        println(book.getDetails())
    }
//    monty.setName("Clarion")
//    println(monty.getName())
//    myLibrary.searchBook("Effective Java")
//    book1.borrow()
//    println(book1.isAvailable())
//    book1.returnBook()
//    println(book1.isAvailable())
////    myLibrary.removeBook(book11)
//    val availableBooks: List<Book> = myLibrary.getAvailableBooks()
//    for(book in availableBooks) {
//        println(book.getDetails())
//    }

}