import data.DataContainer
import java.io.PrintWriter

/*
test inputs:
../test_codes/irtg_example1
../test_codes/irtg_example2
../test_codes/irtg_example3
../test_codes/irtg_example4
../test_codes/antlr_example
../test_codes/xml_example
../test_codes/html_example
*/
fun main(args: Array<String>) {
    val inputPath:String?
    val outPath:String?
    val outfile:PrintWriter
    if (args.size==4 && args[0].compareTo("-in")==0 && args[2].compareTo("-out")==0){
        inputPath=args[1]
        outPath=args[3]
    }
    else{
        println("Give me the path to the input file!")
        inputPath = readLine()
        println("Give me the path to the output file!")
        outPath = readLine()
        println("Thanks!")
    }
    outfile = PrintWriter(outPath)
    val output = DataContainer.loadFile(inputPath?:"", listOf()).output
    println("Output Ready!")
    outfile.print(output)
    outfile.close()
    println("Output File Ready!")
}
