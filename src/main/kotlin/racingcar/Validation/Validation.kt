package racingcar.Validation

import java.lang.NumberFormatException

class Validation {
    fun checkCarNameLength(cars: List<String>) {
        if (!(cars.all { it.count() <= 5 })) {
            throw IllegalArgumentException("자동차 이름은 5자 이하만 가능합니다")
        }
    }

    fun checkInputCarIsNotEmpty(inputCar: String) {
        if (inputCar.isBlank()) {
            throw IllegalArgumentException("자동차 이름을 입력하지 않았습니다")
        }
    }

    fun checkCarNameDuplication(cars: List<String>) {
        if (cars.toSet().size != cars.size) {
            throw IllegalArgumentException("자동차 이름이 중복입니다")
        }

    }
    fun checkCountIsNumber(inputCount: String) {
        try {
            inputCount.toInt()
        } catch (e: NumberFormatException) {
            throw IllegalArgumentException("정수만 입력가능합니다")
        }
    }
}