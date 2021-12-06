package day1

object Analyzer {

    fun getIncreasedMeasurement(windowSize: Int = 1, measures: List<Int>) =
        measures
            .windowed(size = windowSize)
            .map { it.sum() }
            .let {
                it.filterIndexed { index, _ -> isIncreased(index, it) }
            }
            .count()

    private fun isIncreased(index: Int, measurements: List<Int>) =
        (index < measurements.size - 1) && (measurements[index] < measurements[index + 1])

}


