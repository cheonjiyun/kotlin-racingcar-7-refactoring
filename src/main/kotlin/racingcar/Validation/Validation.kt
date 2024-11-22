package racingcar.Validation

import racingcar.Constant.ErrorMessage
import java.lang.NumberFormatException

class Validation {
    fun checkCarNameLength(cars: List<String>) {
        if (!(cars.all { it.count() <= 5 })) {
            throw IllegalArgumentException(ErrorMessage.LENGTH)
        }
    }

    fun checkInputCarIsNotEmpty(inputCar: String) {
        if (inputCar.isBlank()) {
            throw IllegalArgumentException(ErrorMessage.NO_INPUT)
        }
    }

    fun checkCarNameDuplication(cars: List<String>) {
        if (cars.toSet().size != cars.size) {
            throw IllegalArgumentException(ErrorMessage.DUPLICATION)
        }

    }
    fun checkCountIsNumber(inputCount: String) {
        try {
            inputCount.toInt()
        } catch (e: NumberFormatException) {
            throw IllegalArgumentException(ErrorMessage.ONLY_INTEGER)
        }
    }
}