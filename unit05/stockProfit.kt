fun stocks(ns: Double, pp: Double, pc: Double, sp: Double, sc: Double): Double {
    return (((ns * sp) - sc) - ((ns * pp) + pc))
}

fun printStockResult(result: Double) {
    if (result > 0) {
        println("The sale of the stock resulted in a profit of $${String.format("%.2f", result)}\n")
    } else {
        println("The sale of the stock resulted in a loss of $${String.format("%.2f", result)}\n")
    }
}

fun main() {
    while (true) {
        println("Notice: you can enter 'q' to quit anytime")
        print("Enter number of shares >> ")
        var ns = readln().toDoubleOrNull()
        if (ns == null) {
            break
        }

        print("Enter purchase price per share >> ")
        var pp = readln().toDoubleOrNull()
        if (pp == null) {
            break
        }

        print("Enter purchase commission paid >> ")
        var pc = readln().toDoubleOrNull()
        if (pc == null) {
            break
        }

        print("Enter sale price per share >> ")
        var sp = readln().toDoubleOrNull()
        if (sp == null) {
            break
        }

        print("Enter sale commission paid >> ")
        var sc = readln().toDoubleOrNull()
        if (sc == null) {
            break
        }

        val result = stocks(ns, pp, pc, sp, sc)
        printStockResult(result)
    }
}
