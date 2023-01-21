import kotlin.random.Random.Default.nextBoolean

fun main() {
    print("Введите сумму покупки: ")
    var amount = readLine()?.toDouble()
    if(amount === null || amount < 0) {
        println("сумма не может быть отрицательной")
        return
    }

    if(amount > 1000 && amount <= 10_000) {
        amount -= 100
    } else if (amount > 10_000) {
        amount -= amount * 0.05
    }

    val isRegularCustomer = nextBoolean()

    if(isRegularCustomer) {
        amount -= amount * 0.01
    }

    print("""Для ${if(isRegularCustomer) "постоянного" else "непостояного"} покупателя сумма покупки составит $amount₽""")
}