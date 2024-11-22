package racingcar.Game

import camp.nextstep.edu.missionutils.Randoms
import racingcar.View.InputView
import racingcar.View.OutputView

class RacingCar {
    private val outputView = OutputView()
    private val inputView = InputView()

    lateinit var cars: List<String>
    private var count: Int = 0
    private val movingOfCarsRecord = MutableList(cars.count()) { 0 }

    private fun isCanGo(): Boolean {
        return Randoms.pickNumberInRange(0, 9) >= 4
    }

    private fun gameOfOneCar(index: Int) {
        if (isCanGo()) {
            movingOfCarsRecord[index] += 1
        }
    }

    private fun gameOfTurn() {
        for (i in 0 until cars.count()) {
            gameOfOneCar(i)
            outputView.printGameResult(cars[i], movingOfCarsRecord[i])
        }
        println()
    }

    private fun runGame() {
        outputView.printOutput()
        for (i in 0 until count) {
            gameOfTurn()
        }
    }

    // 우승자들 index 추출
    private fun getWinnerIndex(): MutableList<Int> {
        val winners = mutableListOf<Int>()
        var maxNumber = 0

        movingOfCarsRecord.forEachIndexed { idx, it ->
            if (it == maxNumber) {
                winners.addLast(idx)
            }
            if (it > maxNumber) {
                maxNumber = it
                winners.clear()
                winners.addLast(idx)
            }
        }
        return winners
    }

    private fun getWinners(): List<String> {
        return getWinnerIndex().map { cars[it] }
    }

    fun start() {
        cars = inputView.inputCars()
        count = inputView.inputCount()

        runGame()

        val winners = getWinners()
        outputView.printWinner(winners)
    }
}