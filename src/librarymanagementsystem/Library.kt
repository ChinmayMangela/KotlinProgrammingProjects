package librarymanagementsystem

class Library(
    private var name: String,
    private val books: MutableList<Book>
) {
    fun getName(): String = name
    
    fun setName(newName: String) {
        name = newName
    }
   
    
    fun addBook(book: Book) {
        println("New book is added")
        books.add(book)
    }
    
    fun removeBook(book: Book) {
        if(!books.contains(book)) {
            println("${book.getTitle()} book is no longer available")
            return
        }
        books.remove(book)
    }
    
    fun searchBook(titleOfBook: String) {
        val foundBook = books.find {
            it.getTitle().equals(titleOfBook, ignoreCase = true)
        }
        if(foundBook != null) { 
            println("Yeah $titleOfBook book is available")
            return
        }
        println("$titleOfBook is not available")
    }
    
    fun getAvailableBooks(): MutableList<Book> {
        return books
    }
}