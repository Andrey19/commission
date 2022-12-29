import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class MainKtTest {


    @Test
    fun payment_DefaultVkPayCommissionLimitNotExceed_returnZero() {
        val itemCount = 14000.0
        val dayTransaction = 0.0
        val typeCard = "VK Pay"
        val lastSumTransaction = 0.0

        val result = payment(itemCount, dayTransaction)

        assertEquals(0.0, result)
    }
    @Test
    fun payment_DefaultVkPayCommissionTransactionLimitExceed_returnMinusOne() {
        val itemCount = 20000.0
        val dayTransaction = 0.0
        val typeCard = "VK Pay"
        val lastSumTransaction = 0.0

        val result = payment(itemCount, dayTransaction)

        assertEquals(-1.0, result)
    }

    @Test
    fun payment_VkPayCommissionMonthLimitExceed_returnMinusOne() {
        val itemCount = 10000.0
        val dayTransaction = 0.0
        val typeCard = "VK Pay"
        val lastSumTransaction = 40000.0

        val result = payment(itemCount, dayTransaction,typeCard,lastSumTransaction)

        assertEquals(-1.0, result)
    }

    @Test
    fun payment_VkPayCommissionLimitNotExceed_returnZero() {
        val itemCount = 14000.0
        val dayTransaction = 0.0
        val typeCard = "VK Pay"
        val lastSumTransaction = 10000.0

        val result = payment(itemCount, dayTransaction,typeCard,lastSumTransaction)

        assertEquals(0.0, result)
    }
    @Test
    fun payment_MasterCardCommissionLimitNotExceed_returnCommission() {
        val itemCount = 80000.0
        val dayTransaction = 0.0
        val typeCard = "MasterCard"
        val lastSumTransaction = 0.0

        val result = payment(itemCount, dayTransaction,typeCard,lastSumTransaction)

        assertEquals(500.0, result)
    }
    @Test
    fun payment_VisaCommissionLimitNotExceed_returnCommission() {
        val itemCount = 80000.0
        val dayTransaction = 0.0
        val typeCard = "Visa"
        val lastSumTransaction = 0.0

        val result = payment(itemCount, dayTransaction,typeCard,lastSumTransaction)

        assertEquals(600.0, result)
    }
    @Test
    fun payment_MaestroCommissionLimitNotExceed_returnCommission() {
        val itemCount = 80000.0
        val dayTransaction = 0.0
        val typeCard = "Maestro"
        val lastSumTransaction = 0.0

        val result = payment(itemCount, dayTransaction,typeCard,lastSumTransaction)

        assertEquals(500.0, result)
    }
    @Test
    fun payment_MirCommissionLimitNotExceed_returnCommission() {
        val itemCount = 80000.0
        val dayTransaction = 0.0
        val typeCard = "Мир"
        val lastSumTransaction = 0.0

        val result = payment(itemCount, dayTransaction,typeCard,lastSumTransaction)

        assertEquals(600.0, result)
    }
}