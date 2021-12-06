package day1

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class AnalyzerTest {

    @Test
    fun countSingleIncreasedMeasures() {
        val measures = listOf(199, 200, 208, 210, 200, 207, 240, 269, 260, 263)
        val actualIncreasedMeasurements = Analyzer.getIncreasedMeasurement(windowSize = 1, measures = measures)
        Assertions.assertEquals(7, actualIncreasedMeasurements)
    }

    @Test
    fun countIncreasedMeasurementsInWindowOf3() {
        val measures = listOf(199, 200, 208, 210, 200, 207, 240, 269, 260, 263)
        val actualIncreasedMeasurements = Analyzer.getIncreasedMeasurement(windowSize = 3, measures = measures)
        Assertions.assertEquals(5, actualIncreasedMeasurements)
    }

}
