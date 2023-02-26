fun main(args: Array<String>) {
//    val student = Student("Trinh Nguyen Nhat Hieu","21SE1")
//    val teacher = Teacher("Nguyen Van A")
//    student.printInfo()
//    teacher.printInfo()
    var namest = ""
    var inclass = ""
    println("Enter student name: ")
    var input = readlnOrNull()
    if (input != null)
    {
        namest = input
    }
    println("Enter student class: ")
    input = readlnOrNull()
    if (input != null)
    {
        inclass = input
    }


    val student = Student(namest, inclass)
    student.printInfo()

}


