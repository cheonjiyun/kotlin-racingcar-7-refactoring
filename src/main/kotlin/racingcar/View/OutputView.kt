package racingcar.View

class OutputView {
    fun printOutput() {
        println("실행 결과")
    }

    fun printGameResult(carName: String, movingCount: Int) {
        println("$carName : ${"-".repeat(movingCount)}")
    }

    fun printWinner(winners: List<String>) {
        println("최종 우승자 : ${winners.joinToString(", ")}")

    }
}