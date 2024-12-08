package hospitalmanagementsystem.shared

import java.time.LocalDate

class Shared {
    companion object {
        fun getFormattedDate(date: LocalDate): String {
            return "${date.year}/${date.month}/${date.dayOfMonth}"
        }
    }
}