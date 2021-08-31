fun main() {

    payment(76_000_00,"Maestro",140_000_00)
}

fun payment(
    amountOfMoney: Int,
    cardType: String = "VkPay",
    previousPayments: Int = 0,
    noCommissionAction: Int = 75_000_00,
    minimumTax: Int = 35_00,
    maxDayCardPayment: Int = 150_000_00,
    maxDayVKPayment: Int = 15_000_00,
    maxMonthCardPayment: Int = 600_000_00,
    maxMonthVKPayment: Int = 40_000_00,
) {
    val finalPayment: Double
    when (cardType) {
        "Maestro", "Mastercard" -> when {
            previousPayments + amountOfMoney > maxMonthCardPayment -> println("Превышен месячный лимит")
            amountOfMoney > maxDayCardPayment -> println("Превышен суточный лимит")
            amountOfMoney > noCommissionAction -> {
                finalPayment = (amountOfMoney.toDouble() - ((amountOfMoney.toDouble() * 6) / 1000) - 20_00) / 100
                println("Сумма перевода с учётом комиссии и процентов: $finalPayment руб.")
            }
            else -> {
                finalPayment = amountOfMoney.toDouble() / 100
                println("Сумма перевода: $finalPayment руб.")
            }
        }
        "Visa", "Мир" -> {
            when {
                previousPayments + amountOfMoney > maxMonthCardPayment -> println("Превышен месячный лимит")
                amountOfMoney > maxDayCardPayment -> println("Превышен суточный лимит")
                (amountOfMoney.toDouble() * 25) / 1000 < minimumTax -> {
                    finalPayment = (amountOfMoney.toDouble() - minimumTax) / 100
                    println("Сумма перевода с учётом минимальной комиссии: $finalPayment руб.")
                }
                else -> {
                    finalPayment = (amountOfMoney.toDouble() - ((amountOfMoney.toDouble() * 75) / 1000)) / 100
                    println("Сумма перевода с учётом комиссии: $finalPayment руб.")
                }
            }
        }
        "VkPay" -> {
            when {
                previousPayments + amountOfMoney > maxMonthVKPayment -> println("Превышен месячный лимит")
                amountOfMoney > maxDayVKPayment -> println("Превышен суточный лимит")
                else -> {
                    finalPayment = amountOfMoney.toDouble() / 100
                    println("Сумма перевода: $finalPayment руб.")
                }
            }
        }
    }
}




