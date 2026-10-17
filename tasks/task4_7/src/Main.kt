// Task 4.7: finding the longest line in a file
import kotlin.io.path.Path
import kotlin.io.path.forEachLine

fun main(args: Array<String>){

    val filePath = Path(args[0])
    
    var longestLength = 0
    var lineNumber = 0
    var longestLineNumber = 0

    filePath.forEachLine { line -> lineNumber++
        
        if (line.length > longestLength){
        longestLength = line.length
        longestLineNumber = lineNumber
        }
    }
    println("Line $longestLineNumber is the longest (length = $longestLength)")

}