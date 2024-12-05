package librarymanagementsystem

import java.time.Year

class Book(
    private val isbn: String?,
    private val title: String?,
    private val author: String?,
    private val publicationYear: Year?,
    private val publisher: String?,
    private var availabilityStatus: Boolean
) {

    constructor(): this(null, null, null, null, null, true)

    fun getIsbn(): String? = isbn

    fun getTitle(): String? = title

    fun getAuthor(): String? = author

    fun getPublicationYear(): Year? = publicationYear

    fun getPublisher(): String? = publisher


    fun isAvailable(): Boolean = availabilityStatus

    fun borrow() {
        if (isAvailable()) {
            println("You borrowed $title book")
            availabilityStatus = false
            return
        }
        println("Book is not available")

    }

    fun returnBook() {
        availabilityStatus = true
        println("$title book is no longer with you")
    }

    fun getDetails(): String {
        return if(title != null && author != null) {
            "$title by $author"
        } else {
            "Unknown Book"
        }
    }
}