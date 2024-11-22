package racingcar.View

class OutputView {
    fun outputPrint() {
        println("실행 결과")
    }

    fun gameResult(carName: String, movingCount: Int) {
        println("$carName : ${"-".repeat(movingCount)}")
    }

    fun winnerPrint(winners: List<String>) {
        println("최종 우승자 : ${winners.joinToString(", ")}")

    }
}