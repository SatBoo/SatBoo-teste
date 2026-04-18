fun main() {
    val func = 1
    while (func == 1) {
        println("-----------Calculadora-----------")
        println("Selecione a opção para calcular: ")
        println("0 - Sair")
        println("1 - Soma;")
        println("2 - Subtração;")
        println("3 - Multiplicação;")
        println("4 - Divisão;")
        println("5 - Média;")
        var func = readln().toInt()

        when (func) {
            0 -> {
                println("Saindo do programa!")
                break
            }

            1 -> {
                val ope = soma()
                println("A soma é: $ope")
            }

            2 -> {
                val ope = subtracao()
                println("A Subtração é: $ope")
            }

            3 -> {
                val ope = multiplicacao()
                println("A multilplicação é: $ope")
            }

            4 -> {
                val ope = divisao()
                println("A divisão é: $ope")
            }

            5 -> {
                val ope = media()
                println("A média é: $ope")
            }

            else -> {
                println("Entrada inválida")
            }
        }
        println("Deseja realizar outra operação? ")
        println("Digite 1 para SIM!")
        func = readln().toInt()

        when(func){
            1 -> System.out.flush()
            else -> break
        }

    }
}
fun soma(): Int{

    println("Digite dois números: ")
    println("Digite o número 1: ")
    val num1 = readln().toInt()
    println("Digite o número 2: ")
    val num2 = readln().toInt()

    val somar = num1 + num2
    return somar
}

fun subtracao(): Int{

    println("Digite dois números: ")
    println("Digite o número 1: ")
    val num1 = readln().toInt()
    println("Digite o número 2: ")
    val num2 = readln().toInt()

    val subtrair = num1 - num2
    return subtrair
}

fun multiplicacao(): Int{

    println("Digite dois números: ")
    println("Digite o número 1: ")
    val num1 = readln().toInt()
    println("Digite o número 2: ")
    val num2 = readln().toInt()

    val multiplicar = num1 * num2
    return multiplicar
}

fun divisao(): Int{

    println("Digite dois números: ")
    println("Digite o número 1: ")
    val num1 = readln().toInt()
    println("Digite o número 2: ")
    val num2 = readln().toInt()

    val dividir = num1 / num2
    return dividir
}

fun media(): Int{

    println("Digite dois números: ")
    println("Digite o número 1: ")
    val num1 = readln().toInt()
    println("Digite o número 2: ")
    val num2 = readln().toInt()

    val media = (num1 + num2)/2
    return media
}