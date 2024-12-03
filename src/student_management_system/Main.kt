package student_management_system

import java.time.LocalDate

fun main() {
    val address1 = Address("123 Main St", "5A", "Chicago", "IL", 10001, "USA")
    val contactInfo1 = ContactInfo("123-456-7890", "john.doe@example.com")
    val student1 = Student(1, "John Doe", LocalDate.of(2000, 5, 15), address1, contactInfo1, mutableMapOf())

    val myAddress = Address("Mangela Aali", "", "Virar", "MAHARASHTRA", 401303, "INDIA")
    val myContactInfo = ContactInfo(
        "738-575-3757",
        "magelachinmay@gmail.com",
    )
    val monty = Student(
        2, "Monty Mangela", LocalDate.of(2004, 7, 9), myAddress, myContactInfo, mutableMapOf()
    )


    var professor1 = Professor(101, "Dr. Alice", "alice.professor@university.com", "Computer Science")
    var professor2 = Professor(102, "Dr. Bob", "bob.professor@university.com", "Mathematics")

    val madCourse = Course("MAD101", "Mobile App Development", professor1)
    val kotlinCourse = Course("KOT101", "Kotlin Programming", professor1)
    val javaCourse = Course("JAVA101", "Java Programming", professor2)
    val dsaCourse = Course("DSA101", "Data Structures and Algorithms", professor2)

//    monty.addGrade(javaCourse, 99.0)
//    monty.addGrade(kotlinCourse, 87.6)
//    monty.addGrade(dsaCourse, 70.8)
//    monty.addGrade(madCourse, 92.4)
//    println(monty.calculateGPA())

//    madCourse.addStudent(monty)
//
//    for(students: Student in madCourse.students) {
//        print(students.printDetailedInfo())
//    }

//    madCourse.removeStudent(monty)
//    for (students: Student in madCourse.students) {
//        print(students.printDetailedInfo())
//    }
//
//    monty.printDetailedInfo()

//    println(
//        "${monty.getStudentId()}\n" + "${monty.getName()}\n" +
//                "${monty.getAddress()}" + "${monty.getContactInfo()}"
//    )
//    monty.getContactInfo()
//    monty.getCourses()
//    monty.getDateOfBirth()
//
//
//    monty.setContactInfo(contactInfo1)
//    monty.setAddress(address1)
//
//    println(
//        "${monty.getStudentId()}\n" + "${monty.getName()}\n" +
//                "${monty.getAddress()}"
//    )
//    monty.getContactInfo()
//    monty.getCourses()
//    monty.getDateOfBirth()
    val kotlinProgrammingCourse = Course(
        "12",
        "Java Programming",
        professor1
    )

    val flutterCourse = Course(
        "23",
        "Mobile App Dev using flutter and dart",
        professor1
    )

    val mobileAppDevCourse = Course(
        "09",
        "Native mobile app dev using kotlin",
        professor2
    )

    val fullStackWebDevCourse = Course(
        "28",
        "Full stack web dev",
        professor2
    )

    professor1.addCourse(kotlinProgrammingCourse)
    professor1.addCourse(flutterCourse)
    professor2.addCourse(mobileAppDevCourse)
    professor2.addCourse(fullStackWebDevCourse)

    println("${professor1.getName()}\n ${professor1.getProfessorId()}\n ${professor1.getEmail()}\n ${professor1.getDepartment()}")
    professor1.getCourses()

    professor2 = professor1

    println("${professor2.getName()}\n ${professor2.getProfessorId()}\n ${professor2.getEmail()}\n ${professor2.getDepartment()}")
    professor2.getCourses()


}