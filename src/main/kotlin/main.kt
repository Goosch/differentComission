package ru.netology

fun main() {

    val type = "VK Pay"
    val previous = 0
    val amount = 11000
    val result = comission(type, previous, amount)

    when (result) {
        -1 -> println("такой карты нет")
        -2 -> println("превышен лимит")
        else -> println(result)
    }
}

fun comission(type: String, previous: Int, amount: Int): Int {
    when (type) {
        "MasterCard", "Maestro" -> {
            if ((previous + amount) > 600000 && amount > 150000) return -2
            else if ((previous + amount) < 75000) return 0 else return (20 + (previous + amount - 75000) * 0.006).toInt()
        }

        "Visa", "Мир" -> {
            if ((previous + amount) > 600000 && amount > 150000) return -2
            else if (amount * 0.0075 < 35) return 35 else return (amount * 0.0075).toInt()
        }

        "VK Pay" -> {
            if ((previous + amount) > 40000 && amount > 15000) return -2
            else return 0
        }

        else -> return -1
    }
}