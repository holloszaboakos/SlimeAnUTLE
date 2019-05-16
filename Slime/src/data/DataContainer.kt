package data

import data.type.*
import org.antlr.v4.runtime.*
import parser.SlimeLexer
import parser.SlimeParser
import java.io.FileInputStream
import java.io.InputStreamReader
import MySlimeParserVisitor
import java.lang.Exception

//It contains the root File and a shortcut for the File in focus making it always available
//It makes also the import possible
object DataContainer {
    //Files allready opened
    val open = mutableMapOf<String, SFile>()
    //root file
    var root: SFile? = null
    //the file which imported the file under compiling
    var parentFocus: SFile? = null
    //the file under compiling
    var focus: SFile? = null
    //the file which was imported last
    var childFocus: SFile? = null

    //Importing a file
    fun loadFile(path: String, names: List<SName>): SFile {
        val lexer = SlimeLexer(ANTLRInputStream(InputStreamReader(FileInputStream(path))) as CharStream)
        println("Lexer Ready!")
        val parser = SlimeParser(CommonTokenStream(lexer as TokenSource) as TokenStream)
        println("Parser Ready!")
        val tree = parser.file()
        println("ParsTree Ready!")
        val output = MySlimeParserVisitor().visitFile(tree)

        open[path] = childFocus ?: throw Exception("No file added to child focus at import")
        childFocus?.output = output()
        childFocus?.addNames(names)

        return childFocus ?: throw Exception("Child focus shouldn't be null after call of DataContainer.loadFile")

    }
}