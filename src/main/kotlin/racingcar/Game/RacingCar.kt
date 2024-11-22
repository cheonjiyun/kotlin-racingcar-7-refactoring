package racingcar.Game

import camp.nextstep.edu.missionutils.Randoms
import racingcar.View.InputView
import racingcar.View.OutputView

class RacingCar {
    private val outputView = OutputView()
    private val inputView = InputView()

    private val movingOfCarsRecord = MutableList(cars.count()) { 0 }
    lateinit var cars : List<String>
    private var count : Int = 0

    fun isCanGo(): Boolean {
        return Randoms.pickNumberInRange(0, 9) >= 4
    }

    fun gameOfOneCar(index: Int) {
        if (isCanGo()) {
            movingOfCarsRecord[index] += 1
        }
    }

    fun gameOfTurn() {
        for (i in 0 until cars.count()) {
            gameOfOneCar(i)
            outputView.printGameResult(cars[i], movingOfCarsRecord[i])
        }
        println()
    }

    fun game() {
        for (i in 0 until count) {
            gameOfTurn()
        }
    }

    fun getWinnerIndex(): MutableList<Int> {
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

    fun start(){
        cars = inputView.inputCars()
        count = inputView.inputCount()

        game()

        val winners = getWinnerIndex().map { cars[it] }
        outputView.printOutput()
        outputView.printWinner(winners)
    }
}