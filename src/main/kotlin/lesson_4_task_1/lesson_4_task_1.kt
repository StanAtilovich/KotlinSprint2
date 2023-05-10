package lesson_4_task_1

fun main() {
    val bookingToday = 13
    val bookingTomorrow = 9

    val availableToday = bookingToday < TABLES
    println("[Доступность столиков на сегодня: $availableToday]")
    val availableTomorrow = bookingTomorrow < TABLES
    println("[Доступность столиков на завтра: $availableTomorrow]")
}

const val TABLES = 13
