package studentmanagementsystem

class Professor(
    private val professorId: Int,
    private val name: String,
    private val email: String,
    private val department: String
) {
    private val courses: MutableList<Course> = mutableListOf()

    fun getProfessorId(): Int = professorId
    fun getName(): String = name
    fun getEmail(): String = email
    fun getDepartment(): String = department
    fun getCourses() = printAllCourses()


    fun addCourse(course: Course) {
        courses.add(course)
    }
    
    fun removeCourse(course: Course) {
        courses.remove(course)
    }

    private fun printAllCourses() {
        if(courses.isEmpty()) {
            println("You don't have any courses")
            return
        }
        for(course in courses) {
            println(course.getCourseName())
        }
    }
}