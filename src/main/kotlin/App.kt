import day1.Analyzer
import java.io.File

fun main() {
    val measures = File("./src/main/resources/measures.txt").readLines().map { it.toInt() }.toList()

    println("================ Advent of Code 2021 ====================")
    println("DAY1-1: ${Analyzer.getIncreasedMeasurement(measures = measures)}")
    println("DAY1-2: ${Analyzer.getIncreasedMeasurement(windowSize = 3, measures = measures)}")
}
