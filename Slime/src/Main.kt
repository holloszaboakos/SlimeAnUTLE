import org.antlr.v4.runtime.*
import parser.SlimeLexer
import parser.SlimeParser
import java.io.FileInputStream
import java.io.InputStreamReader
import java.io.PrintWriter

//      /home/boss/Documents/Git/SlimeAnUTLE/test_codes/test_complex_short
//      output.irtg
fun main() {
    println("Give me the path to the input file!")
    val inputFile = readLine()
    println("Give me the path to the output file!")
    val outputFile = readLine()
    println("Thanks!")
    val lexer = SlimeLexer(ANTLRInputStream(InputStreamReader(FileInputStream(inputFile))) as CharStream)
    println("Lexer Ready!")
    val parser = SlimeParser(CommonTokenStream(lexer as org.antlr.v4.runtime.TokenSource) as org.antlr.v4.runtime.TokenStream)
    println("Parser Ready!")
    val tree = parser.file()
    println("ParsTree Ready!")
    val outfile = PrintWriter(outputFile)
    val output = MySlimeParserVisitor().visitFile(tree)
    println("Output Ready!")
    outfile.print(output())
    outfile.close()
    println("Output File Ready!")
}
