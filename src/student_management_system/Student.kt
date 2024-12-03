package student_management_system

import java.time.LocalDate

class Student(
    private val studentId: Int,
    private val name: String,
    private val dateOfBirth: LocalDate,
    private var address: Address,
    private var contactInfo: ContactInfo,
    private val grades: MutableMap<Course, Double>
) {

    private val enrolledCourses: MutableList<Course> = mutableListOf()
    fun getStudentId(): Int = studentId
    fun getName(): String = name
    fun getDateOfBirth() = getFormattedDOB()
    fun getAddress(): String = address.getFormattedAddress()
    fun setAddress(newAddress: Address) {
        address = newAddress
    }
    fun getContactInfo() = contactInfo.getFormattedContactInfo()
    fun setContactInfo(newContactInfo: ContactInfo) {
        contactInfo = newContactInfo
    }
    fun getCourses() = printCourses()
    fun getGrades(): MutableMap<Course, Double> = grades
    
    fun enrollInCourse(newCourse: Course) {
        if(enrolledCourses.contains(newCourse)) {
            println("You are already taken this course")
            return
        }
        println("you are enrolled in ${newCourse.getCourseName()}")
        enrolledCourses.add(newCourse)
    }       
    
    fun withdrawFromCourse(course: Course) {
        if(!enrolledCourses.contains(course)) {
            println("You are not enrolled in this course, so you cannot withdraw from it")
            return
        }
        println("You withdraw ${course.getCourseName()}")
        enrolledCourses.remove(course)
    }
    
    fun addGrade(course: Course, grade: Double) {
        if(grade > 100 || grade < 0) {
            println("Grade should be valid. it should be between 0 - 100")
            return
        }
        grades[course] = grade
        println("Grade for ${course.getCourseName()} updated to $grade")
    }
    
    fun calculateGPA(): Double {
        if(grades.isEmpty()) return 0.0
        val totalGradePoints = grades.values.sum()
        return totalGradePoints / grades.size
    }


    fun printDetailedInfo() {
        println("Name: $name")
        println("Date of Birth - $dateOfBirth")
        println("Address: ${address.getFormattedAddress()}")
        println("Contact Info: ")
        contactInfo.getFormattedContactInfo()
        print("Grades: ")
        printGrades()
        println("GPA: ${calculateGPA()}")

    }

    private fun printGrades() {
        if(grades.isEmpty()) {
            print("You haven't added Grades yet")
            return
        }
        print("HERE ARE YOUR GRADES WITH FOR SPECIFIC SUBJECTS\n")
        for(grade in grades) {
            println("${grade.key.getCourseName()}: ${grade.value}")
        }
    }


    private fun printCourses() {
        if(enrolledCourses.isEmpty()) {
            println("You haven't enrolled in any course")
            return
        }
        for(course in enrolledCourses) {
            println(course.getCourseName())
        }
    }

    private fun getFormattedDOB() {
        val year = dateOfBirth.year
        val month = dateOfBirth.month
        val day = dateOfBirth.dayOfMonth
        println("$day/$month/$year")
    }
}