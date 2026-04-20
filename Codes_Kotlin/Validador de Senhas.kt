fun main(){

    if(senhaValida() == true){
        println("Senha válida!")
    } else
        println("Senha inválida!")
}

fun senhaValida(): Boolean {
    println("Digite sua senha: ")
    println("Precisa ter: ")
    println("Letra maiúscula;")
    println("Letra minúscula;")
    println("Número;")
    println("Caracter Especial; ")
    println("No mínimo 8 dígitos.")
    var senha = readln()

    if(senha.length < 8){
        return false
    }

    var temMaiuscula = false
    var temMinuscula = false
    var temDigito = false
    var temEspecial = false

    for(cha in senha){
        if(Character.isUpperCase(cha)){
            temMaiuscula = true
        } else if(Character.isLowerCase(cha)){
            temMinuscula = true
        } else if(Character.isDigit(cha)){
            temDigito = true
        } else if(!Character.isLetterOrDigit(cha)){
            temEspecial = true
        }
    }

    return temDigito && temMaiuscula && temMinuscula && temEspecial
}