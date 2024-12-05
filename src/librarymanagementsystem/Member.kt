package librarymanagementsystem

class Member(
    private val memberId: String,
    private var name: String,
    private val borrowedBooks: MutableList<Book>
) {

    fun getMemberId(): String = memberId

    fun getName(): String = name

    fun setName(newName: String) {
        name = newName
    }

    fun getBorrowedBooks(): MutableList<Book> {
        return borrowedBooks
    }

    fun borrowBook(book: Book) {
        if(borrowedBooks.contains(book)) {
            println("You already have this book")
            return
        }
        if(book.isAvailable()) {
            println("$name borrowed ${book.getDetails()}")
            borrowedBooks.add(book)
            return
        }
        println("Book is not available")
    }

    fun returnBook(book: Book) {
        if(!borrowedBooks.contains(book)) {
            println("You haven't borrowed this book")
            return
        }
        borrowedBooks.remove(book)
        println("$name returned ${book.getTitle()}")
    }

}