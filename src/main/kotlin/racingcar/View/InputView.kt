package racingcar.View

import camp.nextstep.edu.missionutils.Console
import racingcar.Validation.Validation

class InputView {
    private val validation = Validation()

    private fun carsNameTrim(cars: List<String>): List<String> {
        return cars.map { it.trim() }
    }

    fun inputCars(): List<String> {
        println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)")

        val inputCar = Console.readLine()
        validation.checkInputCarIsNotEmpty(inputCar)

        var cars: List<String> = inputCar.split(',')
        validation.checkCarNameDuplication(cars)
        cars = carsNameTrim(cars)
        validation.checkCarNameLength(cars)

        return cars
    }

    fun inputCount(): Int {

        println("시도할 횟수는 몇 회인가요?")
        val inputCount = Console.readLine()
        validation.checkCountIsNumber(inputCount)
        val count = inputCount.toInt()

        return count
    }
}