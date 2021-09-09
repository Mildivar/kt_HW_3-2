package ru.netology

import org.junit.Test

import org.junit.Assert.*
import payment

class MainKtTest {

    @Test
    fun payment_VisaOrMirWithCommission(){
        val amount = 15000000
        val card = "Мир"
        val previous = 0
//        val noCommission = 75_000_00
//        val minx = 35_00
//        val maxDayCard = 150_000_00
//        val maxDayVK = 15_000_00
//        val maxMonthCard = 600_000_00
//        val maxMonthVK = 40_000_00

        val result = payment(
            amountOfMoney = amount,
            cardType = card,
            previousPayments = previous,
//            noCommissionAction = noCommission,
//            minimumTax = minx,
//            maxDayCardPayment = maxDayCard,
//            maxDayVKPayment = maxDayVK,
//            maxMonthCardPayment = maxMonthCard,
//            maxMonthVKPayment = maxMonthVK
        )
        assertEquals(138750, result)
    }

    @Test
    fun payment_MastercardOrMaestroWithCommission(){
        val amount = 15000000
        val card = "Maestro"
        val previous = 0
//        val noCommission = 75_000_00
//        val minx = 35_00
//        val maxDayCard = 150_000_00
//        val maxDayVK = 15_000_00
//        val maxMonthCard = 600_000_00
//        val maxMonthVK = 40_000_00

        val result = payment(
            amountOfMoney = amount,
            cardType = card,
            previousPayments = previous,
//            noCommissionAction = noCommission,
//            minimumTax = minx,
//            maxDayCardPayment = maxDayCard,
//            maxDayVKPayment = maxDayVK,
//            maxMonthCardPayment = maxMonthCard,
//            maxMonthVKPayment = maxMonthVK
        )
        assertEquals(149080, result)
    }

    @Test
    fun payment_Vk(){
        val amount = 1500000
        val card = "VkPay"
        val previous = 0
//        val noCommission = 75_000_00
//        val minx = 35_00
//        val maxDayCard = 150_000_00
//        val maxDayVK = 15_000_00
//        val maxMonthCard = 600_000_00
//        val maxMonthVK = 40_000_00

        val result = payment(
            amountOfMoney = amount,
            cardType = card,
            previousPayments = previous,
//            noCommissionAction = noCommission,
//            minimumTax = minx,
//            maxDayCardPayment = maxDayCard,
//            maxDayVKPayment = maxDayVK,
//            maxMonthCardPayment = maxMonthCard,
//            maxMonthVKPayment = maxMonthVK
        )
        assertEquals(15000, result)
    }

    @Test
    fun payment_VkMaxMonthlyPayment(){
        val amount = 15_000_00
        val card = "VkPay"
        val previous = 35_000_00
//        val noCommission = 75_000_00
//        val minx = 35_00
//        val maxDayCard = 150_000_00
//        val maxDayVK = 15_000_00
//        val maxMonthCard = 600_000_00
//        val maxMonthVK = 40_000_00

        val result = payment(
            amountOfMoney = amount,
            cardType = card,
            previousPayments = previous,
//            noCommissionAction = noCommission,
//            minimumTax = minx,
//            maxDayCardPayment = maxDayCard,
//            maxDayVKPayment = maxDayVK,
//            maxMonthCardPayment = maxMonthCard,
//            maxMonthVKPayment = maxMonthVK
        )
        assertEquals(0, result)
    }

    @Test
    fun payment_VkMaxDailyPayment(){
        val amount = 18_000_00
        val card = "VkPay"
        val previous = 0
//        val noCommission = 75_000_00
//        val minx = 35_00
//        val maxDayCard = 150_000_00
//        val maxDayVK = 15_000_00
//        val maxMonthCard = 600_000_00
//        val maxMonthVK = 40_000_00

        val result = payment(
            amountOfMoney = amount,
            cardType = card,
            previousPayments = previous,
//            noCommissionAction = noCommission,
//            minimumTax = minx,
//            maxDayCardPayment = maxDayCard,
//            maxDayVKPayment = maxDayVK,
//            maxMonthCardPayment = maxMonthCard,
//            maxMonthVKPayment = maxMonthVK
        )
        assertEquals(0, result)
    }

    @Test
    fun payment_MastercardOrMaestroNoCommission(){
        val amount = 7000000
        val card = "Mastercard"
        val previous = 0
//        val noCommission = 75_000_00
//        val minx = 35_00
//        val maxDayCard = 150_000_00
//        val maxDayVK = 15_000_00
//        val maxMonthCard = 600_000_00
//        val maxMonthVK = 40_000_00

        val result = payment(
            amountOfMoney = amount,
            cardType = card,
            previousPayments = previous,
//            noCommissionAction = noCommission,
//            minimumTax = minx,
//            maxDayCardPayment = maxDayCard,
//            maxDayVKPayment = maxDayVK,
//            maxMonthCardPayment = maxMonthCard,
//            maxMonthVKPayment = maxMonthVK
        )
        assertEquals(70000, result)
    }

    @Test
    fun payment_VisaOrMirMinimumTax(){
        val amount = 15000
        val card = "Мир"
        val previous = 0
//        val noCommission = 75_000_00
//        val minx = 35_00
//        val maxDayCard = 150_000_00
//        val maxDayVK = 15_000_00
//        val maxMonthCard = 600_000_00
//        val maxMonthVK = 40_000_00

        val result = payment(
            amountOfMoney = amount,
            cardType = card,
            previousPayments = previous,
//            noCommissionAction = noCommission,
//            minimumTax = minx,
//            maxDayCardPayment = maxDayCard,
//            maxDayVKPayment = maxDayVK,
//            maxMonthCardPayment = maxMonthCard,
//            maxMonthVKPayment = maxMonthVK
        )
        assertEquals(115, result)
    }

    @Test
    fun payment_MastercardOrMaestroMaxMonthlyPayment(){
        val amount = 15000000
        val card = "Mastercard"
        val previous = 57000000
//        val noCommission = 75_000_00
//        val minx = 35_00
//        val maxDayCard = 150_000_00
//        val maxDayVK = 15_000_00
//        val maxMonthCard = 600_000_00
//        val maxMonthVK = 40_000_00

        val result = payment(
            amountOfMoney = amount,
            cardType = card,
            previousPayments = previous,
//            noCommissionAction = noCommission,
//            minimumTax = minx,
//            maxDayCardPayment = maxDayCard,
//            maxDayVKPayment = maxDayVK,
//            maxMonthCardPayment = maxMonthCard,
//            maxMonthVKPayment = maxMonthVK
        )
        assertEquals(0, result)
    }

    @Test
    fun payment_MastercardOrMaestroMaxDailyPayment(){
        val amount = 158_000_00
        val card = "Maestro"
        val previous = 0
//        val noCommission = 75_000_00
//        val minx = 35_00
//        val maxDayCard = 150_000_00
//        val maxDayVK = 15_000_00
//        val maxMonthCard = 600_000_00
//        val maxMonthVK = 40_000_00

        val result = payment(
            amountOfMoney = amount,
            cardType = card,
            previousPayments = previous,
//            noCommissionAction = noCommission,
//            minimumTax = minx,
//            maxDayCardPayment = maxDayCard,
//            maxDayVKPayment = maxDayVK,
//            maxMonthCardPayment = maxMonthCard,
//            maxMonthVKPayment = maxMonthVK
        )
        assertEquals(0, result)
    }

    @Test
    fun payment_VisaOrMirMaxMonthlyPayment(){
        val amount = 25_000_00
        val card = "Мир"
        val previous = 580_000_00
//        val noCommission = 75_000_00
//        val minx = 35_00
//        val maxDayCard = 150_000_00
//        val maxDayVK = 15_000_00
//        val maxMonthCard = 600_000_00
//        val maxMonthVK = 40_000_00

        val result = payment(
            amountOfMoney = amount,
            cardType = card,
            previousPayments = previous,
//            noCommissionAction = noCommission,
//            minimumTax = minx,
//            maxDayCardPayment = maxDayCard,
//            maxDayVKPayment = maxDayVK,
//            maxMonthCardPayment = maxMonthCard,
//            maxMonthVKPayment = maxMonthVK
        )
        assertEquals(0, result)
    }

    @Test
    fun payment_VisaOrMirMaxDailyPayment(){
        val amount = 185_000_00
        val card = "Visa"
        val previous = 0
//        val noCommission = 75_000_00
//        val minx = 35_00
//        val maxDayCard = 150_000_00
//        val maxDayVK = 15_000_00
//        val maxMonthCard = 600_000_00
//        val maxMonthVK = 40_000_00

        val result = payment(
            amountOfMoney = amount,
            cardType = card,
            previousPayments = previous,
//            noCommissionAction = noCommission,
//            minimumTax = minx,
//            maxDayCardPayment = maxDayCard,
//            maxDayVKPayment = maxDayVK,
//            maxMonthCardPayment = maxMonthCard,
//            maxMonthVKPayment = maxMonthVK
        )
        assertEquals(0, result)
    }
}