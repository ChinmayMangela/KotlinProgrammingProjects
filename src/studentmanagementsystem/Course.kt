package studentmanagementsystem

class Course(
    private val courseId: String,
    private val courseName: String,
    private val professor: Professor,
) {
    val students: MutableList<Student> = mutableListOf()
    fun getCourseId(): String = courseId
    fun getCourseName(): String = courseName
    
    fun addStudent(student: Student) {
        if(students.contains(student)) {
            println("This student has already enrolled")
            return
        }
        println("${student.getName()} is added")
        students.add(student)
    }
    
    fun removeStudent(student: Student) {
        if(!students.contains(student)) {
            println("There is no such student")
            return
        }
        println("${student.getName()} removed from $courseName course")
        students.remove(student)
    }


}