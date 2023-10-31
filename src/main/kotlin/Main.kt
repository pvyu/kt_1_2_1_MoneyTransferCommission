fun main() {
    val taxPercent : Double = 0.75
    val taxMinFix : Int = 35

    val amount : Int = 5000000
    var tax : Int = 0

    tax = Math.max((amount * taxPercent/100.0).toInt(), taxMinFix)

    println("Сумма перевода $amount")
    println("Сумма комиссии $tax")
}