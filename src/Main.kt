import java.util.Locale

fun main() {


    var option: String? = "y"
    val usLocale = Locale.forLanguageTag("en-US")
    while (option?.lowercase(usLocale)== "y") {
        menu()
        println("Do you want to continue? (Y/N)")
        option = readlnOrNull()
    }

}

fun menu(){
    println("1- ADD")
    println("2- SUSTRACT")
    println("3- MULTIPLE")
    println("4- DIVIDE")
    println("Enter your option: ")
    val optionInput = readLine()
    val option = optionInput?.toIntOrNull() ?: 0
    when{
        option > 0 && option <5 -> operations(option)
        else -> println("Invalid Option")
    }

}

fun operations(option: Int){

    print("Enter you 1st number: ")
    val value1Input = readLine()
    val value1 = value1Input?.toDoubleOrNull() ?: 0

    print("Enter you 2nd number: ")
    val value2Input = readLine()
    val value2 = value2Input?.toDoubleOrNull() ?: 0

    var result: Double? = 0.0

    when (option) {
        1 -> result = adding(value1, value2)
        2 -> result = sustracting(value1, value2)
        3 -> result = multipling(value1, value2)
        4 -> result = dividing(value1, value2)

        else -> println("UNAVAILABLE OPTION")
    }
    println("Result:"+ String.format("%.2f", result))
}

fun adding(a: Number, b: Number): Double {
    return a.toDouble()+ b.toDouble()
}

fun multipling(a: Number, b: Number): Double {
    return a.toDouble()* b.toDouble()
}

fun dividing(a: Number, b: Number): Double {
    var result: Double = 0.0
    when {
        b.toDouble() != 0.0 -> result = a.toDouble() / b.toDouble()
        else -> println("Send you an exception by Zero divison Rule, undefined value!!!")
    }
    return result

}

fun sustracting(a: Number, b: Number): Double {
    return a.toDouble() - b.toDouble()
}