fun main() {
    val amount = 1000.0
    val commission = calculateCommission(amount)
    println("Комиссия за перевод ${String.format("%.2f", amount)} рублей составит ${String.format("%.2f", commission)} рублей")
}

fun calculateCommission(amount: Double): Double {
    val minimumCommission = 35.0
    val commissionRate = 0.0075
    val commission = amount * commissionRate
    return if (commission < minimumCommission) minimumCommission else commission
}