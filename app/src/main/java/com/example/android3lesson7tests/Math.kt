package com.example.android3lesson7tests

class Math {

    fun add(a: String, b: String): String {
        var result = ""

        if (a == "" || b == "") {
            result = "Поле не заполнено"
        } else if (a.contains(".") || b.contains(".")) {
            val num1 = a.toDouble()
            val num2 = b.toDouble()
            result = (num1 + num2).toString()
        } else if (a.toDoubleOrNull() == null || b.toDoubleOrNull() == null) {
            result = "Символы не складываются"
        } else if (a.toInt() < 0 || b.toInt() < 0) {
            result = "Отрицательные числа не складываются"
        } else {
            val num1 = a.toInt()
            val num2 = b.toInt()
            result = (num1 + num2).toString()
        }

        return result
    }


    fun devite(a: String, b: String): String {
        var result = ""
        if (a == "0" || b == "0") {
            result = "Нельзя делить на ноль"
        } else {
            val num1 = a.toInt()
            val num2 = b.toInt()
            result = (num1 / num2).toString()
        }
        return result
    }
}
