// Task 12.9: demo program for class implementing Static Factory Method
import kotlinx.datetime.LocalDate

fun main() {
    val person = Person.create("John", LocalDate(1999, 3, 29))
    val person1 = Person.create("Ben", LocalDate(1999, 3, 29))


    println("${person.name}, ${person.birth}")
    println("${person1.name}, ${person1.birth}")
}