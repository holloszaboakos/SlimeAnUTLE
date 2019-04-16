import org.antlr.v4.runtime.*
import parser.SlimeLexer
import parser.SlimeParser
import java.io.FileInputStream
import java.io.InputStreamReader
import java.io.PrintWriter
import java.util.regex.Pattern

//      /home/boss/Documents/Git/SlimeAnUTLE/test_simple_long
//      output.irtg
fun main() {
    println("Give me the path to the input file!")
    val inputFile = readLine()
    println("Give me the path to the output file!")
    val outputFile = readLine()
    println("Thanks!")
    val lexer = SlimeLexer(ANTLRInputStream(InputStreamReader(FileInputStream("/home/boss/Documents/Git/SlimeAnUTLE/test_complex_long"))) as CharStream)
    println("Lexer Ready!")
    val parser = SlimeParser(CommonTokenStream(lexer as TokenSource) as TokenStream)
    println("Parser Ready!")
    val tree = parser.file()
    println("ParsTree Ready!")
    val outfile = PrintWriter("output.irtg")
    val output = MySlimeParserVisitor().visitFile(tree)
    println("Output Ready!")
    outfile.print(output())
    outfile.close()
    println("Output File Ready!")
}
