fun main() {

    println("Advinhe o número de 1 a 100! Você tem 5 tentativas!")

    val numb = (1..100).random()

    var tent = 0

    while(tent < 5){

        println("Digite um número: ")
        var chute = readln().toInt()

        if(chute == numb){
            println("Parabéns! Acertou o número na tentativa ${tent + 1}")
            break
        } else if(chute < numb){
            println("O número sorteado é maior restam ${4 - tent} tentativas")
            tent++
        } else{
            println("O número sorteado é menor restam ${4 - tent} tentativas")
            tent++
        }
        if (tent == 5){
            println("Você perdeu!")
            println("O número era: $numb")
        }
    }

}