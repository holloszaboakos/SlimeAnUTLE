package data

import data.type.*
import org.antlr.v4.runtime.*
import parser.SlimeLexer
import parser.SlimeParser
import java.io.FileInputStream
import java.io.InputStreamReader
import java.io.PrintWriter
import MySlimeParserVisitor
import java.lang.Exception

object DataContainer {
    var root:SFile?=null
    var parentFocus:SFile?=null
    var focus:SFile?=null
    var childFocus:SFile?=null
    fun loadFile(path:String,names:List<SName>):SFile{
        val lexer = SlimeLexer(ANTLRInputStream(InputStreamReader(FileInputStream(path))) as CharStream)
        println("Lexer Ready!")
        val parser = SlimeParser(CommonTokenStream(lexer as TokenSource) as TokenStream)
        println("Parser Ready!")
        val tree = parser.file()
        println("ParsTree Ready!")
        val output = MySlimeParserVisitor().visitFile(tree)
        childFocus?.output=output()
        childFocus?.addNames(names)
        return childFocus?: throw Exception("Child focus shouldn't be null after call of DataContainer.loadFile")

    }
}